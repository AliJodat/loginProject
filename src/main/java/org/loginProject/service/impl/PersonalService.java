package org.loginProject.service.impl;
import org.loginProject.model.GroupPerson;
import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.repository.generic.IGenericRepository;
import org.loginProject.repository.impl.PersonalRepo;
import org.loginProject.service.IGroupPersonService;
import org.loginProject.service.IPersonalService;
import org.loginProject.service.generic.GenericService;
import org.loginProject.service.generic.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class PersonalService extends GenericService<Personal> implements IPersonalService {

    @Autowired
    private IPersonalRepo iPersonalRepo;


    @Override
    protected IGenericRepository getGenericRepo() {
        return iPersonalRepo;
    }


    @Override
    @Transactional
    public void save(Personal entity) {
        if(entity.getId() == null || entity.getId() > -1){
            Personal personal = super.loadById(entity.getId());
            personal.setCode(entity.getCode());
            personal.setName(entity.getName());
            personal.setFamily(entity.getFamily());
            personal.setUsername(entity.getUsername());
            personal.setPassword(entity.getPassword());
            super.update(personal);
        }else {
            entity.setRoleId(2);
            super.save(entity);
        }

    }

    @Override
    public Boolean findPersonalByUsername(Personal personal) {
        return iPersonalRepo.findPersonalByUsername(personal);
    }
}
