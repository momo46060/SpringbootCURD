package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Bean
    public DataSource sybasedataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("sybase.jdbc4.jdbc.SybaseDriver"); // Replace if needed based on your driver
        dataSourceBuilder.driverClassName("com.sybase.jdbc4.jdbc.SybDriver"); // Replace if needed based on your driver
        dataSourceBuilder.url("jdbc:sybase:Tds:172.16.0.230:5000/mobile");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("semmaa");
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
