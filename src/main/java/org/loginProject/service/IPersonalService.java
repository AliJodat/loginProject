package org.loginProject.service;

import org.loginProject.model.Personal;

/**
 * @author Ali
 * Create on 4/19/2018 11:06 AM
 */
public interface IPersonalService {

    boolean findPersonalByUsername(Personal personal);
}
