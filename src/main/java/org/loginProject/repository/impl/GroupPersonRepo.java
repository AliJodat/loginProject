package org.loginProject.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.loginProject.model.GroupPerson;
import org.loginProject.model.Personal;
import org.loginProject.repository.IGroupPersonRepo;
import org.loginProject.repository.generic.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



@Transactional
@Repository
public class GroupPersonRepo extends GenericRepository<GroupPerson> implements IGroupPersonRepo {

    @Override
    protected Class<GroupPerson> getDomainClass() {
        return GroupPerson.class;
    }



    @PersistenceContext
    private EntityManager entityManager;


}
