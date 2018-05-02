package org.loginProject.web.controller;
import org.loginProject.model.Personal;
import org.loginProject.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/getUserName")
public class PersonalController  {
    @Autowired
    private IPersonalService iPersonalService;
    @PostMapping("/saveNewUser")
    public Boolean saveNewUser (@RequestBody Personal personal){
        iPersonalService.save(personal);
        return true;
    }
    @PostMapping("/findPersonalByUsername")
    public Boolean findPersonalByUsername (@RequestBody Personal personal){
        iPersonalService.findPersonalByUsername(personal);

        return true;
    }
    @PostMapping("/getPersonAll")
    public List getPersonAll (){
       return iPersonalService.getAll();

    }
}
