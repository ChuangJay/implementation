
package com.example._2022_0519_0833_51_code.repos;


import com.example._2022_0519_0833_51_code.entities.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepo extends CrudRepository<Person, Long> {

}
