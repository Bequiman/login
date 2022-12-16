package com.example.simplifica.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.simplifica.model.Login;

@Repository
public class LoginRepository {

    @Autowired
    JdbcTemplate jdbc;    

    public List<Login> findAll() {
        return jdbc.query("select email, senha, usuario from usuario;",
            (resultSet, rowNum) -> {
                Login login = new Login();
                login.setEmail(resultSet.getString("email"));
                login.setSenha(resultSet.getString("senha"));
                login.setUsuario(resultSet.getString("usuario"));
                return login;
            });
        }

     

}
