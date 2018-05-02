package org.loginProject.service.generic;

import org.loginProject.model.Personal;

import java.util.List;
public interface IGenericService<T> {

    List<T> getAll();

    void save(T entity);

    void delete (T entity);

    void deleteEntityById(Long entityId);
    void findPersonalByUsername (T entity);
    void update (T entity);
    int count ();
}
