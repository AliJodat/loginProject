package org.loginProject.repository;
import org.loginProject.model.Personal;
import org.loginProject.repository.generic.IGenericRepository;
public interface IPersonalRepo extends IGenericRepository<Personal> {

    Boolean findPersonalByUsername(Personal personal);
}
