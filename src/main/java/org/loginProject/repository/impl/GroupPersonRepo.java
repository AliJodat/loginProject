package org.loginProject.repository.impl;

import org.loginProject.model.GroupPerson;
import org.loginProject.model.Personal;
import org.loginProject.repository.IGroupPersonRepo;
import org.loginProject.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ali
 * Create on 4/19/2018 11:16 AM
 */
@Repository
public class GroupPersonRepo extends GenericRepository<Personal> implements IGroupPersonRepo {

    @Override
    protected Class<Personal> getDomainClass() {
        return Personal.class;
    }

    private GroupPerson groupPerson;

    @PersistenceContext
    private EntityManager entityManager;

    
}
