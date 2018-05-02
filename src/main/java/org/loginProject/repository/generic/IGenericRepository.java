package org.loginProject.repository.generic;

import org.loginProject.model.Personal;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;


public  interface IGenericRepository<T> {
    List<T> getAll();

    T loadById (Long id);

    void add (T entity);
    void update (T entity);

    void delete (T entity);
    void deleteEntityById(Long id);
    void findPersonalByUsername (T entity);
    int count ();
}
