
package com.example._2022_0428_1400_47_code.module_dao.ex;


public class UnexpectedException extends RuntimeException {
    public UnexpectedException(String message) {
        super(message);
    }

    public UnexpectedException(String message, Throwable cause) {
        super(message, cause);
    }
}
