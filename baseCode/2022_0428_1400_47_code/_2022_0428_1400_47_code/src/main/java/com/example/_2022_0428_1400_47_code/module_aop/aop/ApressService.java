package com.example._2022_0428_1400_47_code.module_aop.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ApressService {
}
