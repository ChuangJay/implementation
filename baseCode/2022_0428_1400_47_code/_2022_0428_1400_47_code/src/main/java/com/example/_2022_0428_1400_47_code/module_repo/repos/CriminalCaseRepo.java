package com.example._2022_0428_1400_47_code.module_repo.repos;

import com.example._2022_0428_1400_47_code.module_dao.dao.CriminalCase;
import com.example._2022_0428_1400_47_code.module_dao.dao.Detective;
import com.example._2022_0428_1400_47_code.module_dao.util.CaseStatus;
import com.example._2022_0428_1400_47_code.module_dao.util.CaseType;
import jdk.jshell.spi.ExecutionControl;

import java.util.Optional;
import java.util.Set;


public interface CriminalCaseRepo extends  AbstractRepo<CriminalCase>  {

    Set<CriminalCase> findByLeadInvestigator(Detective detective);

    Optional<CriminalCase> findByNumber(String caseNumber);

    Set<CriminalCase> findByStatus(CaseStatus status) throws ExecutionControl.NotImplementedException;

    Set<CriminalCase> findByType(CaseType type) throws ExecutionControl.NotImplementedException;

}
