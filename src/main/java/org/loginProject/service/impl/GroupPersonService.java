package org.loginProject.service.impl;

import org.loginProject.repository.IGroupPersonRepo;
import org.loginProject.service.IGroupPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ali
 * Create on 4/19/2018 11:17 AM
 */
@Service
public class GroupPersonService implements IGroupPersonService {

    @Autowired
    private IGroupPersonRepo iGroupPersonRepo;
}
