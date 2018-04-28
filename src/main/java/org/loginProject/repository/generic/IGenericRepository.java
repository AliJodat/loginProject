package org.loginProject.repository.generic;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ali
 * Create on 4/19/2018 11:52 AM
 */

public  interface IGenericRepository<T> {
    List<T> getAll();

    T loadById (Long id);

    void add (T entity);
    void update (T entity);

    void delete (T entity);
    void deleteEntityById(Long id);

    int count ();
}
