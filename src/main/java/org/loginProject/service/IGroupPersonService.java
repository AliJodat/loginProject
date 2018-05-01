package org.loginProject.service;

import org.loginProject.model.GroupPerson;
import org.loginProject.model.Personal;
import org.loginProject.service.generic.IGenericService;

/**
 * @author Ali
 * Create on 4/19/2018 11:17 AM
 */
public interface IGroupPersonService extends IGenericService<GroupPerson> {
    void save (GroupPerson groupPerson);
}
