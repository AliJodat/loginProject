package org.loginProject.web.controller;

import org.loginProject.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ali
 * Create on 4/19/2018 11:05 AM
 */

@RestController
@RequestMapping("/getUserName")
public class PersonalController {

    @Autowired
    private IPersonalService iPersonalService;

    @PostMapping("/findPersonalByUsername")
    public boolean findPersonalByUsername(String username, String password){
        return iPersonalService.findPersonalByUsername(username,password);
    }
}
