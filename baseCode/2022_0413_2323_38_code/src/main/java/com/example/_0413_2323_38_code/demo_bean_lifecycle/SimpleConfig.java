package com.example._0413_2323_38_code.demo_bean_lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example._0413_2323_38_code.demo_bean_lifecycle"} )
public class SimpleConfig {

    @Bean
    SimpleBean simpleBean(){
        return new SimpleBean();
    }

}
