package org.loginProject.service.impl;

import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ali
 * Create on 4/19/2018 11:05 AM
 */

@Service
public class PersonalService implements IPersonalService {

    @Autowired
    private IPersonalRepo iPersonalRepo;

    @Override
    public boolean findPersonalByUsername(Personal personal){

        return  iPersonalRepo.findPersonalByUsername(personal);
    }
}
