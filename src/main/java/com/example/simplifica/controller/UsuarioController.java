package com.example.simplifica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simplifica.model.Usuario;
import com.example.simplifica.repository.UsuarioRepository;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioRepository repository;
  

    @GetMapping("/inscrever-se")
    public String formCadastroUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    } 

    @PostMapping("/inscrever-se")
    public String gravaNovoUsuario(Usuario usuario) {
        repository.save(usuario);
        return "redirect:login";
    }


    /* 
    @GetMapping("perfil")
    public String relatorio(Model model) {
        model.addAttribute("usuario", repository.findAll());
        return "perfil";
    }
    */

}
