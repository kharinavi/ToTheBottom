package ru.kharina.study.bottom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public Person person(){
        return new Person();
    }
}
