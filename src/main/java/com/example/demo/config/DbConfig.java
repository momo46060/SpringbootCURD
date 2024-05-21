package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DbConfig {
    @Autowired
    private Environment env;
    @Bean
    public DataSource sybasedataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("sybase.jdbc4.jdbc.SybaseDriver"); // Replace if needed based on your driver
        dataSourceBuilder.driverClassName(env.getProperty("spring.datasource.driverClassName")); // Replace if needed based on your driver
        dataSourceBuilder.url(env.getProperty("spring.datasource.url"));
        dataSourceBuilder.username(env.getProperty("spring.datasource.username"));
        dataSourceBuilder.password(env.getProperty("spring.datasource.password"));
        return dataSourceBuilder.build();
    }


    @Bean
    public DataSource mysqldataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Replace with your driver class
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1/cloud_vendor");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        // Other HikariCP configurations
        return dataSource;
    }
}
