
package com.example._2022_0428_1400_47_code.module_repo.repos;

import com.example._2022_0428_1400_47_code.module_dao.dao.AbstractEntity;

import java.util.Optional;


public interface AbstractRepo <T extends AbstractEntity> {

    void save(T entity);

    void delete(T entity);

    T update(T entity);

    int deleteById(Long entityId);

    Optional<T> findById(Long entityId);
}
