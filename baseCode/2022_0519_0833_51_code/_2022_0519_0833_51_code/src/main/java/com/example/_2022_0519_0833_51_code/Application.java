
package com.example._2022_0519_0833_51_code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String... args) {
		var ctx = SpringApplication.run(Application.class, args);
		ctx.registerShutdownHook();
		logger.info("Application Started ...");
	}
}
