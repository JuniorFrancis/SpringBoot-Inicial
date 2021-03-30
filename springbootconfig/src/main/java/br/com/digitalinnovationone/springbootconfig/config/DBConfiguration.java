package br.com.digitalinnovationone.springbootconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
//@Getter
//@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConnection()
    {
        System.out.println("DB connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2-TEST - Test Instance";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection()
    {
        System.out.println("DB Connection for Production - MySQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to Production MYSQL_PROD - Production instance";

    }

    //TODO Include ProjectLombok  to substitute methods Getters and Setters
    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
