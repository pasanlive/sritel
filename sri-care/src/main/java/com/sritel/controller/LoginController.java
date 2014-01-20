package com.sritel.controller;

/**
 *
 * @author Maleen Chethiya
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String welcome(ModelMap model) {

        model.addAttribute("message", "Click here to login");

        //Spring uses InternalResourceViewResolver and return back index.jsp
        return "login/index";

    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(ModelMap model) {

        model.addAttribute("message", "sd");

        //Spring uses InternalResourceViewResolver and return back index.jsp
        return "index";

    }
}
