package org.loginProject.service;

import org.loginProject.model.GroupPerson;
import org.loginProject.model.Personal;
import org.loginProject.service.generic.IGenericService;

public interface IGroupPersonService extends IGenericService<GroupPerson> {
    void save (GroupPerson groupPerson);
}
