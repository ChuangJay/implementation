
package com.example._2022_0519_0833_51_code;

import com.example._2022_0519_0833_51_code.entities.Person;
import com.example._2022_0519_0833_51_code.repos.PersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class Initializer {

    private Logger logger = LoggerFactory.getLogger(Initializer.class);
    private PersonRepo personRepo;

    public Initializer(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @PostConstruct
    public void init() {
        logger.info(" -->> Starting database initialization...");
        var person = new Person();
        person.setFirstName("Sherlock");
        person.setLastName("Holmes");
        personRepo.save(person);
        logger.info(" -->> Database initialization finished.");
    }
}
