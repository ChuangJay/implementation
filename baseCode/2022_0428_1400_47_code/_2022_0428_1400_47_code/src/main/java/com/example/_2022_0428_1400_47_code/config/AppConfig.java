package com.example._2022_0428_1400_47_code.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.example._2022_0428_1400_47_code.services", "com.example._2022_0428_1400_47_code.repos"})
@EnableTransactionManagement
public class AppConfig {

}
