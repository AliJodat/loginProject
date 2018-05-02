package org.loginProject.repository;
import org.loginProject.model.Personal;
import org.loginProject.repository.generic.IGenericRepository;

import java.util.List;

public interface IPersonalRepo extends IGenericRepository<Personal> {


    List<Personal> getAll();

    boolean findPersonalByUsername(String username, String password);
}
