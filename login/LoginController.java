package com.example.simplifica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.simplifica.model.Login;

@Controller
public class LoginController {
         
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("login", new Login());
       
        return "login";
    }
 
       
}
