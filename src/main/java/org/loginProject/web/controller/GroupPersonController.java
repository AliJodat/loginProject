package org.loginProject.web.controller;


import org.loginProject.model.GroupPerson;
import org.loginProject.service.IGroupPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/getInsertGroupPersonal")
public class GroupPersonController {

    @Autowired
    private IGroupPersonService iGroupPersonService;


    @PostMapping("/saveNewGroup")
    public Boolean saveNewGruop (@RequestBody GroupPerson groupPerson){
        iGroupPersonService.save(groupPerson);
        return true;
    }

    @GetMapping("/getAll")
    public List<GroupPerson> listGroup (){
        return iGroupPersonService.getAll();
    }


}
