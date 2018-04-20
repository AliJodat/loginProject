package org.loginProject.service.generic;

import java.util.List;

/**
 * @author Ali
 * Create on 4/20/2018 2:39 AM
 */
public interface IGenericService<T> {

    List<T> getAll();
    void add(T entity);
    void delete (T entity);
    void deleteEntityById(int entityId);
    void update (T entity);
    int count ();
}
