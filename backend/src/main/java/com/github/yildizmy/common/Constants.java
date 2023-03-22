package com.github.yildizmy.common;

/**
 * Constant variables used in the project
 */
public final class Constants {

    private Constants() {
    }

    public static final String TRACE = "trace";
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    public static final String DATE_TIME_FORMAT = "dd.MM.yyyy HH:mm:ss";

    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String UNAUTHORIZED_ERROR = "Unauthorized error: {}";
    public static final String CANNOT_SET_AUTH = "Cannot set user authentication: {}";
    public static final String NOT_FOUND_USERNAME = "User Not Found with username: %s";
    public static final String INVALID_JWT_SIGN = "Invalid JWT signature: {}";
    public static final String INVALID_JWT_TOKEN = "Invalid JWT token: {}";
    public static final String JWT_EXPIRED = "JWT token is expired: {}";
    public static final String JWT_UNSUPPORTED = "JWT token is unsupported: {}";
    public static final String JWT_EMPTY = "JWT claims string is empty: {}";
    public static final String VALIDATION_ERROR = "Validation error. Check 'errors' field for details";
    public static final String UNKNOWN_ERROR = "Unknown error occurred";
    public static final String METHOD_ARGUMENT_NOT_VALID = "MethodArgumentNotValid exception";
    public static final String ALREADY_EXISTS = "Requested element is already exists";
}
