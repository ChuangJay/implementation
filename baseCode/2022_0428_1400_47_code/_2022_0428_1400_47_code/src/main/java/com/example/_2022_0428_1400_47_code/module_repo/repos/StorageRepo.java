package com.example._2022_0428_1400_47_code.module_repo.repos;
import com.example._2022_0428_1400_47_code.module_dao.dao.Storage;

import java.util.Optional;

public interface StorageRepo extends AbstractRepo<Storage> {

    Optional<Storage> findByName(String name);

    Optional<Storage> findByLocation(String location);
}
