package com.example._2022_0428_1400_47_code.module_repo.repos.impl;


import com.example._2022_0428_1400_47_code.module_dao.dao.CriminalCase;
import com.example._2022_0428_1400_47_code.module_dao.dao.Detective;
import com.example._2022_0428_1400_47_code.module_dao.util.CaseStatus;
import com.example._2022_0428_1400_47_code.module_dao.util.CaseType;
import com.example._2022_0428_1400_47_code.module_repo.repos.CriminalCaseRepo;
import com.example._2022_0428_1400_47_code.module_repo.repos.util.CriminalCaseRowMapper;
import jdk.jshell.spi.ExecutionControl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Repository
public class JdbcCriminalCaseRepo  extends JdbcAbstractRepo<CriminalCase> implements CriminalCaseRepo {
    private RowMapper<CriminalCase> rowMapper = new CriminalCaseRowMapper();

    public JdbcCriminalCaseRepo(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public Optional<CriminalCase> findById(Long id) {
        var sql = "select ID, CASE_NUMBER, CASE_TYPE, STATUS, SHORT_DESCRIPTION from CRIMINAL_CASE where ID= ?";
        return Optional.of(jdbcTemplate.queryForObject(sql, rowMapper, id));
    }

    @Override
    public Set<CriminalCase> findByLeadInvestigator(Detective detective) {
        var sql =  "select ID, CASE_NUMBER, CASE_TYPE, STATUS, SHORT_DESCRIPTION from CRIMINAL_CASE c, DETECTIVE d where c.LEAD_INVESTIGATOR=d.ID and d.ID= ?";
        return new HashSet<>(jdbcTemplate.query(sql, new Object[]{detective.getId()}, rowMapper));
    }

    @Override
    public Optional<CriminalCase> findByNumber(String caseNumber) {
        var sql = "select ID, CASE_NUMBER, CASE_TYPE, STATUS, SHORT_DESCRIPTION from CRIMINAL_CASE where CASE_NUMBER= ?";
        var result = jdbcTemplate.queryForObject(sql, rowMapper, caseNumber);
        return result == null ? Optional.empty() :  Optional.of(result);
    }

    @Override
    public void save(CriminalCase cc) {
        jdbcTemplate.update(
                "insert into CRIMINAL_CASE(ID, CASE_NUMBER, CASE_TYPE, STATUS, SHORT_DESCRIPTION, LEAD_INVESTIGATOR ) values(?,?,?,?,?,?,?)",
                cc.getId(), cc.getNumber(), cc.getType(), cc.getStatus(), cc.getShortDescription(), cc.getLeadInvestigator().getId()
        );
    }

    @Override
    public void delete(CriminalCase entity) {
        jdbcTemplate.update("delete from CRIMINAL_CASE where ID =? ", entity.getId());
    }

    @Override
    public int deleteById(Long entityId) {
        return jdbcTemplate.update("delete from CRIMINAL_CASE where ID =? ", entityId);
    }

    @Override
    public Set<CriminalCase> findByStatus(CaseStatus status) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not needed for this implementation.");
    }

    @Override
    public Set<CriminalCase> findByType(CaseType type) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not needed for this implementation.");
    }
}
