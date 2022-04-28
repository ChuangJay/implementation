
package com.example._2022_0428_1400_47_code.module_repo.repos;


import com.example._2022_0428_1400_47_code.module_dao.dao.Detective;
import com.example._2022_0428_1400_47_code.module_dao.util.Rank;

import java.util.Optional;
import java.util.Set;


public interface DetectiveRepo extends AbstractRepo<Detective> {

    Set<Detective> findAll();

    Optional<Detective> findByBadgeNumber(String badgeNumber);

    Set<Detective> findbyRank(Rank rank);

    default Optional<Detective> findByIdWithPersonDetails(Long id) {
        return Optional.empty();
    }
}
