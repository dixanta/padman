/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.dao;

import com.heroku.web.entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository("UserDAOImpl")
public class UserDAOImpl implements UserDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> getAll() {
        String sql="select * from users";
        return jdbcTemplate.query(sql,new RowMapper<User>() {

            public User mapRow(ResultSet rs, int i) throws SQLException {
               return new User()
                       .setId(rs.getInt("id"))
                       .setUserName(rs.getString("username"))
                       .setPassword(rs.getString("password"))
                       .setEmail(rs.getString("email"))
                       .setStatus(rs.getBoolean("status"));
            }
        });
    }

    public int insert(User user) {
        String sql="insert into users(username,password,email,status)"
                + " values(?,?,?,?)";
        return jdbcTemplate.update(sql,
                new Object[]{user.getUserName(),user.getPassword(),
                user.getEmail(),user.isStatus()});
    }

    public User login(String userName, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
