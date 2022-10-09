package com.example.fiveplusdemo.FiveplusDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/parents_home")
public class ParentsController {

    @GetMapping("/profile")
    public String parentsProfile() {
        return "parents_home";
    }

    @GetMapping("/")
    public String parentsMain1() {
        return "redirect:parents_home/profile";
    }

    @GetMapping("")
    public String parentsMain2() {
        return "redirect:parents_home/profile";
    }

    @GetMapping("/chats")
    public String parentsChats() {
        return "chats";
    }

    @GetMapping("/history")
    public String parentsLessonsHistory() {
        return "history";
    }

    @GetMapping("/activation")
    public String parentsActivation() {
        return "activation";
    }

    @GetMapping("/help")
    public String parentsHelp() {
        return "help";
    }

    @GetMapping("/404")
    public String parentsError404() {
        return "error404";
    }


}
