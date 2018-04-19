package org.loginProject.repository.generic;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Ali
 * Create on 4/19/2018 11:51 AM
 */

@Repository
public abstract class  GenericRepository<T> implements  IGenericRepository<T>{
    protected Class<T> domainClass = getDomainClass();
    protected abstract Class<T> getDomainClass();

    @PersistenceContext
    private EntityManager entityManager;

    public List<T> getAll() {
        return entityManager.createQuery("from " + domainClass.getName() + " e where e.deleted = false").getResultList();
    }

    @Transactional
    public void add (T entity){
        entityManager.persist(entity);
    }

    @Transactional
    public void delete (T entity){
        entityManager.remove(entityManager.merge(entity));
    }

    @Transactional
    public void deleteEntityById(int entityId){
        Object obj = entityManager.find(domainClass, entityId);
        entityManager.remove(obj);
    }

    @Transactional
    public void update (T entity){
        entityManager.merge(entity);
    }

    public int count (){
        int count = (int) (entityManager.createQuery("select count(*) from " +domainClass.getName())).getSingleResult();
        return count;
    }



}
