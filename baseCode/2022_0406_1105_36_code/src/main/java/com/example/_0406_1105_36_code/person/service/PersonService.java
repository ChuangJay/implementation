package com.example._0406_1105_36_code.person.service;

import com.example._0406_1105_36_code.ex.InvalidCriteriaException;
import com.example._0406_1105_36_code.person.Person;
import com.example._0406_1105_36_code.util.CriteriaDto;
import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();

    long countPersons();

    Optional<Person> findById(Long id);

    Person save(Person person);

    Person updateFirstName(Person person, String newFirstname);

    void delete(Person person);

    Optional<Person> findByUsername(String username);

    Optional<Person> findByCompleteName(String firstName, String lastName);

    String getPersonAsHtml(String username);

    List<Person> getByCriteriaDto(CriteriaDto criteria) throws InvalidCriteriaException;

}