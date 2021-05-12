package com.greg.spring.ioctest.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.greg.spring")
public class AppConfig {
}
