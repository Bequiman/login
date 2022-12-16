package com.example.simplifica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resultado {
    private long id;
	private String usuario;
	private int totalCorretas = 0;
}
