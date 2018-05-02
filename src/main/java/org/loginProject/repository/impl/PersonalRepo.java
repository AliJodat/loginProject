package org.loginProject.repository.impl;
import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class PersonalRepo  extends GenericRepository<Personal> implements IPersonalRepo {

    @Override
    protected Class<Personal> getDomainClass() {
        return Personal.class;
    }

    @Override
    public List<Personal> getAll() {
        return super.getAll();
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean findPersonalByUsername(String username, String password){
                String hql = (" from "+getDomainClass().getName()+ " e where e.username= :username ");
             //  String hql = (" from "+getDomainClass().getName()+ " e where 1=1 ");

                       if(!username.isEmpty()) {
                       hql += (" and e.username= :username ");
                    }
        if(!password.isEmpty()) {
            hql += (" and e.password= :password ");
        }
        /*public boolean findPersonalByUsername(String username, String password){
            query.setParameter("password",password);

            String confernPassword=query.getSingleResult().toString();
                    if(confernPassword.isEmpty())
                        if(confernPassword.isEmpty()){

                return false;
                        return true;
                        return true;}
        }*/
        return true;

    }
}