package com.weather.forecast.util;

/**
 *
 * @author hfredi35@gmail.com
 */
public class Util {

    public static final String OK_RESPONSE = "OK";
    public static final String ERROR_RESPONSE = "ERROR";

    public static final int API_KEY_IS_NOT_ACTIVATED = 401;
    public static final int CITY_NAME_WRONG_FORMAT = 404;
    public static final int ACCOUNT_TEMPORARY_BLOCKED_EXCEEDING_OF_REQUESTS = 429;   // Account is temporary blocked due to exceeding of requests
    public static final int SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_1 = 500;
    public static final int SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_2 = 502;
    public static final int SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_3 = 503;
    public static final int SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_4 = 504;

    public static final String CHECKED_API_KEY_MESSAGE = "Check your right API key or see if activated, in you account";
    public static final String FORMAT_CITY_NAME_INCORRECT_MESSAGE = "The format of the city name is incorrect";
    public static final String EXCEEDED_THE_LIMIT_OF_CALLS_MESSAGE = "Account is temporary blocked due to exceeding of requests";
    public static final String SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_MESSAGE = "Service Unavailable. Contact us for assistance and find a solution";
}
