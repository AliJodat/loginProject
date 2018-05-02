package org.loginProject.repository.generic;
import org.loginProject.model.generic.BaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public abstract class  GenericRepository<T extends BaseEntity> implements  IGenericRepository<T>{
    protected Class<T> domainClass = getDomainClass();
    protected abstract Class<T> getDomainClass();
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<T> getAll() {
        return entityManager.createQuery("from " + domainClass.getName() + " e where e.deleted = false").getResultList();
    }
    @Override
    public T loadById(Long id){
        return entityManager.find(domainClass,id);
    }
    @Override
    public void add(T entity){
        entityManager.merge(entity);
    }
    @Override
    public void delete (T entity){
        entityManager.remove(entityManager.merge(entity));
    }
    @Override
    public void deleteEntityById(Long id){
        Object obj = entityManager.find(domainClass, id);
        entityManager.remove(obj);
    }
    @Override
    public void update (T entity){
        entityManager.merge(entity);
    }
    @Override
    public int count (){
        int count = (int) (entityManager.createQuery("select count(*) from " +domainClass.getName())).getSingleResult();
        return count;
    }

    @Override
    public void findPersonalByUsername(T entity) {

    }
}
