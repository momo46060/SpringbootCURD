package com.example.demo.repository;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.example.demo.*")
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Replace with your driver class
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1/cloud_vendor");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        // Other HikariCP configurations
        return dataSource;
    }
}

