package org.loginProject.service;


import org.loginProject.model.Personal;
import org.loginProject.service.generic.IGenericService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ali
 * Create on 4/19/2018 11:06 AM
 */

public interface IPersonalService extends IGenericService<Personal> {

    boolean findPersonalByUsername(Personal personal);

    void save (Personal entity);
}
