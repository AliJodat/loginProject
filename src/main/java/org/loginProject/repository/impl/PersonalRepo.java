package org.loginProject.repository.impl;

import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ali
 * Create on 4/19/2018 10:53 AM
 */

@Repository
public class PersonalRepo  implements IPersonalRepo {

    private Personal personal;

    @PersistenceContext
    private EntityManager entityManager;

}
