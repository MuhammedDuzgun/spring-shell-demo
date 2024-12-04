package com.demo.spring_shell.config;

import com.demo.spring_shell.exception.ExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ExceptionHandler exceptionHandler() {
        return new ExceptionHandler();
    }

}
