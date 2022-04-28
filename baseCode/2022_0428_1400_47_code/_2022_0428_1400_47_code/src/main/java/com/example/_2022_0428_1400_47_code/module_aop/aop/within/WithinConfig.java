
package com.example._2022_0428_1400_47_code.module_aop.aop.within;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = {"com.apress.cems.aop.service","com.apress.cems.aop.within", "com.apress.cems.repos"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class WithinConfig {
}
