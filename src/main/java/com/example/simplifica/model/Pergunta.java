package com.example.simplifica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pergunta {
    private long Id;
	private String titulo;
	private String opcaoA;
	private String opcaoB;
	private String opcaoC;
	private int resposta;
	private int escolha;    
}
