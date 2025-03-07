package com.travelplanner.travelplannerbackend;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
public class ApplicationConfig {
        @Bean(name = "sessionFactory")
        public LocalSessionFactoryBean  sessionFactory(){
            String PACKAGE_NAME = "com.travelplanner.travelplannerbackend.entity";
            LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
            sessionFactory.setDataSource(dataSource());
            sessionFactory.setPackagesToScan(PACKAGE_NAME);
            sessionFactory.setHibernateProperties(hibernateProperties());
            return sessionFactory;
        }

        @Bean(name="dataSource")
        public DataSource dataSource(){
            String RDS_INSTANCE="travelplanner-instance.cosws9mmtdnt.us-east-2.rds.amazonaws.com";
            String USERNAME = "admin";
            String PASSWORD = "q1234567";
            DriverManagerDataSource dataSource=new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://" + RDS_INSTANCE + ":3306/travelPlanner_backEnd?createDatabaseIfNotExist=true&serverTimezone=UTC");
            dataSource.setUsername(USERNAME);
            dataSource.setPassword(PASSWORD);
            return dataSource;
        }

    private final Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        return hibernateProperties;
    }
}
