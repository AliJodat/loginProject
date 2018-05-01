package org.loginProject.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Ali
 * Create on 4/19/2018 11:03 AM
 */


@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String LoginIndex() {
        return "/Login/LoginIndex";
    }

    @RequestMapping("/login")
    public String Login() {
        return "/Login/Login";
    }

    @RequestMapping("/index")
    public String Index() {
        return "/index";
    }

    @RequestMapping("/Insert_Group_personal")
    public String Insert_Group_personal() {
        return "/Login/Insert_Group_personal";
    }


}
