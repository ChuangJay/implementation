package com.example._2022_0519_0833_51_code.aop;

import com.example._2022_0519_0833_51_code.entities.Person;
import com.example._2022_0519_0833_51_code.services.PersonService;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PersonMonitor {

    private static final Logger logger = LoggerFactory.getLogger(PersonMonitor.class);

    @Pointcut("execution(* com.example._2022_0519_0833_51_code.services.*Service+.save*(..)) && args(person) && target(service)")
    public void onSave(Person person, PersonService service){}

    private static final String[] SPECIAL_CHARS = new String[]{"$", "#", "&", "%"};

    @Before("onSave(person,service) ")
    public void beforeSave(Person person, PersonService service) {
        logger.info("[beforeSave]: ---> Target object {}", service.getClass());

        if (StringUtils.indexOfAny(person.getFirstName(), SPECIAL_CHARS) != -1 ||
                StringUtils.indexOfAny(person.getLastName(), SPECIAL_CHARS) != -1) {
            throw new IllegalArgumentException("Text contains weird characters!");
        }
    }
}
