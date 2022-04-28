package com.example._2022_0428_1400_47_code.module_aop.aop.service;

import com.example._2022_0428_1400_47_code.module_dao.dao.Storage;

import java.util.Optional;


public interface StorageService {
    Optional<Storage> findByName(String name);

    Optional<Storage> findByLocation(String location);

    void save(Storage storage);

    void saveEvidenceSet(Storage storage);

    void delete(Storage entity);

    int deleteById(Long entityId);

    Optional<Storage> findById(Long entityId);

}
