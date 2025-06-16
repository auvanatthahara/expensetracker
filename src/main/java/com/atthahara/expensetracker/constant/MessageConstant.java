package com.atthahara.expensetracker.constant;

public enum MessageConstant {
    USER_CREATED("User created successfully!"),
    USER_DELETED("User deleted successfully!"),
    LOGIN_SUCCESS("Login success!"),
    LOGIN_FAILED("Failed to login!"),
    USER_NOT_FOUND("User does not exist!"),
    INVALID_PASSWORD("Wrong password");

    public final String message;

    private MessageConstant(String message) {
        this.message = message;
    }

}
