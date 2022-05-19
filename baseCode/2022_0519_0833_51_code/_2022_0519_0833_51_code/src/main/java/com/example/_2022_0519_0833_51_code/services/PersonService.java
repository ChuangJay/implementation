
package com.example._2022_0519_0833_51_code.services;


import com.example._2022_0519_0833_51_code.entities.Person;

import java.util.Optional;
import java.util.Set;


public interface PersonService {
    Set findAll();

    long count();

    Optional<Person> findById(Long id);

    Person save(Person person);

    void delete(Person person);
}
