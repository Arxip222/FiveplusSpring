package com.example.fiveplusdemo.FiveplusDemo.controller;


import com.example.fiveplusdemo.FiveplusDemo.model.User;
import com.example.fiveplusdemo.FiveplusDemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DifController {

    public final UserService userService;

    public DifController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/login")
    public String parentsChats() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegister(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model){
        if(!userService.createUser(user)) {
            model.addAttribute("errorMessage", "");
        }
        return "redirect:/login";
    }
}
