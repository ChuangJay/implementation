
package com.example._2022_0428_1400_47_code.module_aop.aop.service;


import com.example._2022_0428_1400_47_code.module_dao.dao.Person;
import com.example._2022_0428_1400_47_code.module_aop.aop.exception.MailSendingException;
import jdk.jshell.spi.ExecutionControl;

import java.util.Optional;
import java.util.Set;


public interface PersonService {
    Set<Person> findAll();

    long countPersons();

    Optional<Person> findById(Long id);

    Person save(Person person);

    Person updateFirstName(Person person, String newFirstname);

    void delete(Person person);

    Optional<Person> findByUsername(String username);

    Optional<Person> findByCompleteName(String firstName, String lastName);

    String getPersonAsHtml(String username) throws ExecutionControl.NotImplementedException;

    Person updatePassword(Person person, String password) throws MailSendingException, ExecutionControl.NotImplementedException;

    default Person updateUsername(Person person, String newUsername){
        return null;
    };
}
