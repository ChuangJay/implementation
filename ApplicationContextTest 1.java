package com.example._0413_2323_38_code.demo_bean_lifecycle;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;
class ApplicationContextTest {
    private Logger logger = LoggerFactory.getLogger(ApplicationContextTest.class);

    @Test
    void testSimpleBeans() {
        var ctx = new AnnotationConfigApplicationContext(SimpleConfig.class);
        ctx.registerShutdownHook();
        logger.info(" >> init done.");
        var simpleBean = ctx.getBean(SimpleBean.class);
        assertNotNull(simpleBean);
        ctx.registerShutdownHook();
        logger.info(" >> usage done.");
    }

}
