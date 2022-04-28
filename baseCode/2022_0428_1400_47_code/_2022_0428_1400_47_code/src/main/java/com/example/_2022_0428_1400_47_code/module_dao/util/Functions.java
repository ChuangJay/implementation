
package com.example._2022_0428_1400_47_code.module_dao.util;

import com.example._2022_0428_1400_47_code.module_dao.dao.AbstractEntity;

import java.util.Comparator;


public class Functions {

    public static Comparator<AbstractEntity> COMPARATOR_BY_ID = Comparator.comparing(AbstractEntity::getId);
}
