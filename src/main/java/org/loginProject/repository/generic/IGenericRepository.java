package org.loginProject.repository.generic;

/**
 * @author Ali
 * Create on 4/19/2018 11:52 AM
 */

public  interface IGenericRepository<T> {

    void add (T entity);
    void delete (T entity);
    void deleteEntityById(int entityId);
    void update (T entity);
    int count ();
}
