package com.example._2022_0428_1400_47_code.module_dao.dto;

/**
 * Created by iuliana.cosmina on 3/31/15.
 */
public enum FieldGroup {
    FIRSTNAME,
    LASTNAME,
    USERNAME,
    HIREDIN;

    public static FieldGroup getField(String field){
        return FieldGroup.valueOf(field.toUpperCase());
    }
}
