package com.example.fiveplusdemo.FiveplusDemo.controller;

import com.example.fiveplusdemo.FiveplusDemo.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
@RequestMapping("/parents_home")
public class ParentsController {

    @GetMapping("/profile")
    public String parentsProfile() {
        return "parents_home";
    }


    @ModelAttribute
    public void getLoggedInUser(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        model.addAttribute("user", userDetails);
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
