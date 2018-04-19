package org.loginProject.web.controller;

import org.loginProject.service.IGroupPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ali
 * Create on 4/19/2018 11:18 AM
 */

@RestController
public class GroupPersonController {

    @Autowired
    private IGroupPersonService iGroupPersonService;

}
