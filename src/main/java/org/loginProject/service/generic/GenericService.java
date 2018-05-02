package org.loginProject.service.generic;

import org.loginProject.repository.generic.IGenericRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;



@Service
public abstract class GenericService<T> implements IGenericService<T> {

    protected abstract IGenericRepository<T> getGenericRepo();

    @Override
    public List getAll() {
        return getGenericRepo().getAll();
    }


    @Override
    public void save(T entity) {
        getGenericRepo().add(entity);
    }

    @Override
    public void findPersonalByUsername(T entity) {

    }

    @Override
    public void delete(T entity) {
        getGenericRepo().delete(entity);
    }

    @Override
    public void deleteEntityById(Long id) {
        getGenericRepo().deleteEntityById(id);
    }

    @Override
    public void update(T entity) {
        getGenericRepo().update(entity);
    }

    @Override
    public int count() {
        return getGenericRepo().count();
    }

    public T loadById(Long id) {
        return getGenericRepo().loadById(id);
    }
}

