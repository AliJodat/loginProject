package org.loginProject.repository;

import org.loginProject.model.Personal;
import org.loginProject.repository.generic.IGenericRepository;

/**
 * @author Ali
 * Create on 4/19/2018 10:53 AM
 */
public interface IPersonalRepo extends IGenericRepository<Personal> {


    boolean findPersonalByUsername(Personal personal);
}
