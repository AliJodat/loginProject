package org.loginProject.repository.impl;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@Transactional
public class PersonalRepo extends GenericRepository<Personal> implements IPersonalRepo {

    @Override
    protected Class<Personal> getDomainClass() {
        return Personal.class;
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Boolean findPersonalByUsername(Personal personal) {

        String hql = (" from " + getDomainClass().getName() + " e where 1=1 ");

        /*if (!personal.getUsername().isEmpty()) {
            hql += (" and e.username= '%" + personal.getUsername() + "%' ");
        }
        if (!personal.getPassword() .isEmpty()) {
            hql += (" and e.password like '%" + personal.getPassword() + "%' ");
        }*/
        if (!personal.getUsername().isEmpty()) {
            hql += (" and e.username= :username ");
        }
        if (!personal.getPassword().isEmpty()) {
            hql += (" and e.password = :password ");
        }

        Query query = entityManager.createQuery(hql);
        query.setParameter("username", personal.getUsername());
        query.setParameter("password", personal.getPassword());

        if (query.getSingleResult().toString() == null)
            return false;
        else
            return true;

    }
}