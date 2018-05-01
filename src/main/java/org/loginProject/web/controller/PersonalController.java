package org.loginProject.web.controller;
import org.loginProject.model.Personal;
import org.loginProject.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/getUserName")
public class PersonalController {
    @Autowired
    private IPersonalService iPersonalService;
    @PostMapping("/saveNewUser")
    public Boolean saveNewUser (@RequestBody Personal personal){
        iPersonalService.save(personal);
        return true;
    }
}
