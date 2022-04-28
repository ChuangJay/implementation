package com.example._2022_0428_1400_47_code.module_aop.aop.service;


import com.example._2022_0428_1400_47_code.module_dao.dao.Detective;
import com.example._2022_0428_1400_47_code.module_dao.dao.Person;
import com.example._2022_0428_1400_47_code.module_dao.util.Rank;

import java.util.Optional;
import java.util.Set;


public interface DetectiveService {

    Set<Detective> findAll();

    Optional<Detective> findById(Long id);

    Detective createDetective(Person person, Rank rank);

    Optional<Detective> findByBadgeNumber(String badgeNumber);

    Set<Detective> findByRank(Rank rank);
}
