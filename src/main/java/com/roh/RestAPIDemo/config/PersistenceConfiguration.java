package com.roh.RestAPIDemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
	@Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.username("root");
        builder.password("root");
        builder.url("jdbc:mysql://localhost:3306/demo");
        System.out.println("DATABASE INITIALISED AT SERVER END");
        return builder.build();
    }

}
