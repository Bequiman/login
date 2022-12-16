package com.example.simplifica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simplifica.model.Usuario;
import com.example.simplifica.repository.UsuarioRepository;

@Controller
public class LoginController {
    @Autowired
    UsuarioRepository repository;
  

    @GetMapping("/login")
    public String formLogin(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "login";
    } 

    @PostMapping("/inscrever-se")
    public String gravaNovoUsuario(Usuario usuario) {
        repository.save(usuario);
        return "redirect:login";
    }
    
}
