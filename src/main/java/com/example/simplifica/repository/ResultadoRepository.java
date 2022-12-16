package com.example.simplifica.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.simplifica.model.Resultado;

@Repository
public class ResultadoRepository {

    @Autowired
    JdbcTemplate jdbc;

    public void save(Resultado resultado) {
        String sql = "insert into resultado(usuario,perguntas_corretas_total) values (?,?);";
        jdbc.update(sql, resultado.getUsuario(), resultado.getTotalCorretas());
    }

    public List<Resultado> findAll(Sort sort) {
        return jdbc.query("select * from resultado;", this::mapper);
    }
       

    private Resultado mapper(ResultSet registro, int contador) throws SQLException {
            return new Resultado(registro.getLong("id"), registro.getString("usuario"), registro.getInt("totalCorretas"));
    }
}
