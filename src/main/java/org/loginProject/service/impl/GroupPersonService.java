package org.loginProject.service.impl;
import org.loginProject.model.GroupPerson;
import org.loginProject.model.Personal;
import org.loginProject.repository.IGroupPersonRepo;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.repository.generic.IGenericRepository;
import org.loginProject.service.IGroupPersonService;
import org.loginProject.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class GroupPersonService extends GenericService<GroupPerson> implements IGroupPersonService {
    @Autowired
    private IGroupPersonRepo iGroupPersonRepo;
    @Override
    protected IGenericRepository getGenericRepo() {
        return iGroupPersonRepo;
    }
    @Override
    @Transactional
    public void save(GroupPerson entity) {
        if(entity.getId() == null || entity.getId() > -1){
            GroupPerson groupPerson = super.loadById(entity.getId());
           // entity.setCode(entity.getCode());
            entity.setName(entity.getName());
            super.update(groupPerson);
        }else {
            super.save(entity);
        }
    }
}