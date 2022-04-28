package com.example._2022_0428_1400_47_code.module_repo.repos;

/**
 * Created by iuliana.cosmina on 4/17/16.
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
