package com.ycx.jpa.config;

import com.ycx.starter.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/18 10:45
 * @description
 **/
@Configuration
public class Config {
    @Bean
    public PersonService personService(){
        return new PersonService("就发了","天空");
    }
}
