
package com.example._2022_0428_1400_47_code.module_repo.repos.util;

import com.example._2022_0428_1400_47_code.module_dao.dao.Detective;
import com.example._2022_0428_1400_47_code.module_dao.dao.Person;
import com.example._2022_0428_1400_47_code.module_dao.util.EmploymentStatus;
import com.example._2022_0428_1400_47_code.module_dao.util.Rank;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DetectiveRowMapper implements RowMapper<Detective> {
    @Override
    public Detective mapRow(ResultSet rs, int rowNum) throws SQLException {
        var id = rs.getLong("ID");
        var badgeNumber = rs.getString("BADGE_NUMBER");
        var rank = rs.getString("RANK");
        var armed = rs.getBoolean("ARMED");
        var status = rs.getString("STATUS");
        var personId = rs.getLong("PERSON_ID");

        var person = new Person();
        person.setId(personId);
        person.setUsername(rs.getString("USERNAME"));
        person.setFirstName(rs.getString("FIRSTNAME"));
        person.setLastName(rs.getString("LASTNAME"));
        person.setHiringDate(rs.getTimestamp("HIRINGDATE").toLocalDateTime());

        var detective = new Detective();
        detective.setId(id);
        detective.setPerson(person);
        detective.setBadgeNumber(badgeNumber);
        detective.setRank(Rank.valueOf(rank));
        detective.setArmed(armed);
        detective.setStatus(EmploymentStatus.valueOf(status));

        return detective;
    }
}
