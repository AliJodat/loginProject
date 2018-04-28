package org.loginProject.repository.impl;

import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Ali
 * Create on 4/19/2018 10:53 AM
 */

@Repository

public class PersonalRepo  extends GenericRepository<Personal> implements IPersonalRepo {

    @Override
    protected Class<Personal> getDomainClass() {
        return Personal.class;
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean findPersonalByUsername(Personal personal){
        String hql = " from "+getDomainClass().getName()+ " e where 1=1 ";

        if(!personal.getUsername().isEmpty()) {
            hql += " and e.username= :username ";
        }
        if(!personal.getPassword().isEmpty()) {
            hql += " and e.password= :password ";
        }
        Query query = entityManager.createQuery(hql);
        query.setParameter("username",personal.getUsername());
        query.setParameter("password",personal.getPassword());

        String confernPassword=query.getSingleResult().toString();
        if(confernPassword.isEmpty()){

            return false;
        }else{
        return true;}
    }


}
