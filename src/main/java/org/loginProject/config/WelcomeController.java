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
        return "redirect:/Login/Login";
    }


}
