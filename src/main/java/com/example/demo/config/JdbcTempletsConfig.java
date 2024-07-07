package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTempletsConfig {



    @Bean
    public JdbcTemplate sybaseJdbcTemplate(DataSource sybasedataSource) {
        return new JdbcTemplate(sybasedataSource);
    }


    @Bean
    public JdbcTemplate mysqlJdbcTemplate(DataSource mysqldataSource) {
        return new JdbcTemplate(mysqldataSource);
    }
}
