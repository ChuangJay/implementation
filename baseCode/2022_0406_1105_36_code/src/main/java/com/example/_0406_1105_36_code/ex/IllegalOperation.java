package com.example._0406_1105_36_code.ex;

public class IllegalOperation extends RuntimeException {
    public IllegalOperation(String message) {
        super(message);
    }

    public IllegalOperation(String message, Throwable cause) {
        super(message, cause);
    }
}
