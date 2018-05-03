package org.loginProject.web.controller;
import org.loginProject.model.GroupPerson;
import org.loginProject.model.Personal;
import org.loginProject.service.IGroupPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getInsert_Group_personal")
public class GroupPersonController {


    @Autowired
    private IGroupPersonService iGroupPersonService;


    @PostMapping("/saveNewGroup")
    public Boolean saveNewGruop (@RequestBody GroupPerson groupPerson){
        iGroupPersonService.save(groupPerson);
        return true;
    }
}
