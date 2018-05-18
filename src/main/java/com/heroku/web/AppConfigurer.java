/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author USER
 */
@Configuration
public class AppConfigurer {
    @Bean
    public DataSource getDataSource(){
        String url="jdbc:postgresql://ec2-50-17-206-214.compute-1.amazonaws.com/dehqmo1vsmspas?sslmode=require";
        String user="lsssveenhajpsl";
        String password="fbe0ba83b36c346a98985aaf7e54253b492cfd8249255a01e84aede21b0ed721";
        DataSource ds=new DriverManagerDataSource(url, user, password);
        return ds;
    }
    
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
}
