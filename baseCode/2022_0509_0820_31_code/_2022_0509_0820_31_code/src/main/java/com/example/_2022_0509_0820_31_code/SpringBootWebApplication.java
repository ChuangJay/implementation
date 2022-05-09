
package com.example._2022_0509_0820_31_code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootWebApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringBootWebApplication.class);

    public static void main(String... args) {
        var ctx = SpringApplication.run(SpringBootWebApplication.class, args);
        ctx.registerShutdownHook();
        logger.info("Application Started ...");
    }
}
