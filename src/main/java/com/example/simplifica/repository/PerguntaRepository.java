package com.example.simplifica.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.simplifica.model.Pergunta;

@Repository
public class PerguntaRepository {

    @Autowired
    JdbcTemplate jdbc;

    public List<Pergunta> findAll() {
        return jdbc.query("select id, titulo, opcaoA, opcaoB, opcaoC, resposta, escolha from perguntas;",
                (resultSet, rowNum) -> {
                    Pergunta perguntas = new Pergunta();
                    perguntas.setId(resultSet.getLong("id"));
                    perguntas.setTitulo(resultSet.getString("titulo"));
                    perguntas.setOpcaoA(resultSet.getString("opcaoA"));
                    perguntas.setOpcaoB(resultSet.getString("opcaoB"));
                    perguntas.setOpcaoC(resultSet.getString("opcaoC"));
                    perguntas.setOpcaoC(resultSet.getString("opcaoC"));
                    perguntas.setResposta(resultSet.getInt("resposta"));
                    perguntas.setEscolha(resultSet.getInt("escolha"));
                    return perguntas;
                });
    }

}
