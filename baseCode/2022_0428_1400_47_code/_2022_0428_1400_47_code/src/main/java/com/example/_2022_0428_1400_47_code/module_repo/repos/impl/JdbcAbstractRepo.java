
package com.example._2022_0428_1400_47_code.module_repo.repos.impl;

import com.example._2022_0428_1400_47_code.module_dao.dao.AbstractEntity;
import com.example._2022_0428_1400_47_code.module_repo.repos.AbstractRepo;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Optional;


public class JdbcAbstractRepo<T extends AbstractEntity> implements AbstractRepo<T> {

    protected JdbcTemplate jdbcTemplate;

    public JdbcAbstractRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(T entity) {
    }

    @Override
    public T update(T entity) {
        return null;
    }


    @Override
    public void delete(T entity) {

    }

    @Override
    public int deleteById(Long entityId) {
        return 0;
    }

    @Override
    public Optional<T> findById(Long entityId) {
        return null;
    }

}
