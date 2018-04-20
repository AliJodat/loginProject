package org.loginProject.service.generic;

import org.loginProject.repository.generic.IGenericRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Ali
 * Create on 4/20/2018 2:39 AM
 */

@Service
@Transactional
public abstract class GenericService<T> implements IGenericService<T> {

    protected abstract IGenericRepository<T> getGenericRepo();

    @Override
    public List getAll() {
        return getGenericRepo().getAll();
    }

    @Override
    public void add(T entity) {
        getGenericRepo().add(entity);
    }

    @Override
    public void delete(T entity) {
        getGenericRepo().delete(entity);
    }

    @Override
    public void deleteEntityById(int entityId) {
        getGenericRepo().deleteEntityById(entityId);
    }

    @Override
    public void update(T entity) {
        getGenericRepo().update(entity);
    }

    @Override
    public int count() {
        return getGenericRepo().count();
    }
}
