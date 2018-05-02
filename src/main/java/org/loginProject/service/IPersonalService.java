package org.loginProject.service;
import org.loginProject.model.Personal;
import org.loginProject.service.generic.IGenericService;
import org.springframework.transaction.annotation.Transactional;
public interface IPersonalService extends IGenericService<Personal> {
    void save (Personal entity);
    void findPersonalByUsername (Personal entity);
}
