package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "Good Morning everyone.");
        model.addAttribute("secondvar", "Thank you for your support.");
        return "hometemplate";

    }

}
