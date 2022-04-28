package com.example._2022_0428_1400_47_code.module_repo.repos;


import com.example._2022_0428_1400_47_code.module_dao.dao.CriminalCase;
import com.example._2022_0428_1400_47_code.module_dao.dao.Evidence;
import com.example._2022_0428_1400_47_code.module_dao.dao.Storage;

import java.util.Optional;
import java.util.Set;


public interface EvidenceRepo extends AbstractRepo<Evidence> {

    Set<Evidence> findByCriminalCase(CriminalCase criminalCase);

    Optional<Evidence> findByNumber(String evidenceNumber);

    boolean isInStorage(Storage storage);
}
