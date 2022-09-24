package com.example.fiveplusdemo.FiveplusDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexing(){
        return "redirect:parents_home";
    }

    @GetMapping("/parents_home")
    public String parentsHome(){
        return "parents_home";
    }

    @GetMapping("/pages-contact.html")
    public String contact(){
        return "pages-contact";
    }

}
