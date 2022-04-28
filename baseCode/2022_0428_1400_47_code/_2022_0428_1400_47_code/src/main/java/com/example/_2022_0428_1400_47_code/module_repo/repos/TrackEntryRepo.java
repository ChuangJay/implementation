package com.example._2022_0428_1400_47_code.module_repo.repos;



import com.example._2022_0428_1400_47_code.module_dao.dao.TrackEntry;
import com.example._2022_0428_1400_47_code.module_dao.util.TrackAction;

import java.util.Date;
import java.util.Set;


public interface TrackEntryRepo extends AbstractRepo<TrackEntry> {

    Set<TrackEntry> findByDetectiveId(Long detectiveId);
    Set<TrackEntry> findByEvidenceId(Long evidenceId);
    Set<TrackEntry> findByDate(Date date);
    Set<TrackEntry> findByDateAndAction(Date date, TrackAction action);

}
