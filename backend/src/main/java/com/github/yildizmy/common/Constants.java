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
    public static final int IBAN_MIN_SIZE = 15;
    public static final int IBAN_MAX_SIZE = 34;
    public static final long IBAN_MAX = 999999999;
    public static final long IBAN_MODULUS = 97;

    public static final String SUCCESS = "Success";
    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String UNAUTHORIZED_ERROR = "Unauthorized error: {}";
    public static final String CANNOT_SET_AUTH = "Cannot set user authentication: {}";
    public static final String NOT_FOUND_USERNAME = "User with username of {0} is not found";
    public static final String INVALID_JWT_SIGN = "Invalid JWT signature: {}";
    public static final String INVALID_JWT_TOKEN = "Invalid JWT token: {}";
    public static final String JWT_EXPIRED = "JWT token is expired: {}";
    public static final String JWT_UNSUPPORTED = "JWT token is unsupported: {}";
    public static final String JWT_EMPTY = "JWT claims string is empty: {}";
    public static final String VALIDATION_ERROR = "Validation error. Check 'errors' field for details";
    public static final String UNKNOWN_ERROR = "Unknown error occurred";
    public static final String METHOD_ARGUMENT_NOT_VALID = "MethodArgumentNotValid exception";
    public static final String FIELD_NOT_VALIDATED = "Field is not validated";

    public static final String LOGGED_IN_USER = "User logged in (username: {})";
    public static final String ALREADY_EXISTS = "Requested element already exists";
    public static final String ALREADY_EXISTS_USER_NAME = "User with the same username already exists";
    public static final String ALREADY_EXISTS_USER_EMAIL = "User with the same email already exists";
    public static final String ALREADY_EXISTS_WALLET_IBAN = "Wallet with the same iban already exists";
    public static final String ALREADY_EXISTS_WALLET_NAME = "Wallet with the same name already exists";
    public static final String NOT_FOUND = "Requested element is not found";
    public static final String NOT_FOUND_RECORD = "Not found any record";
    public static final String NOT_FOUND_WALLET = "Requested wallet is not found";
    public static final String NOT_FOUND_TRANSACTION = "Requested transaction is not found";
    public static final String CREATED_USER = "User is created (username: {})";
    public static final String CREATED_WALLET = "Wallet is created (iban: {} --- name: {} --- balance: {})";
    public static final String CREATED_TRANSACTION = "Transaction is created (from: {} --- to: {} --- amount: {})";
    public static final String UPDATED_WALLET = "Wallet is updated (iban: {} --- name: {} --- balance: {})";
    public static final String DELETED_WALLET = "Wallet is deleted (iban: {} --- name: {} --- balance: {})";
    public static final String FUNDS_CANNOT_BELOW_ZERO = "Transfer amount should be higher than or equal to wallet balance";
    public static final String UPDATED_WALLET_BALANCE = "Wallet balance is updated (New Wallet Balance: {})";
    public static final String UPDATED_WALLET_BALANCES = "Wallet balances are updated (Wallet of sender: {} --- Wallet of receiver: {})";
}
