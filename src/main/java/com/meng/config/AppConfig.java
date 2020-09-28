package com.meng.config;

import com.meng.HaohaoHelloworld;
import com.meng.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HaohaoHelloworld();
    }
}
