package com.example.simplifica.model;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private Long id;

    private String nome, usuario, email,senha, genero;
   
    private Date aniversario;
    
}
