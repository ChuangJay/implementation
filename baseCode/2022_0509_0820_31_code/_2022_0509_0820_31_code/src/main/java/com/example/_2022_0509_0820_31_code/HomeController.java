
package com.example._2022_0509_0820_31_code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("message", "Spring MVC ThymeleafExample!!");
        return "home";
    }
}