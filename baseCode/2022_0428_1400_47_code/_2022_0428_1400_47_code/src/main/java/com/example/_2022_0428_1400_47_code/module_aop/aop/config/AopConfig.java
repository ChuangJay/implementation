
package com.example._2022_0428_1400_47_code.module_aop.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = {"com.example._2022_0428_1400_47_code._2022_0428_1400_50_code.aop", "com.example._2022_0428_1400_47_code.repos"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
