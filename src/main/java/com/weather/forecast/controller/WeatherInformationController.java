package com.weather.forecast.controller;

import com.weather.forecast.model.ForecastWeather;
import com.weather.forecast.response.WeatherForecastResponse;
import com.weather.forecast.service.WeatherInformationService;
import static com.weather.forecast.util.Util.ACCOUNT_TEMPORARY_BLOCKED_EXCEEDING_OF_REQUESTS;
import static com.weather.forecast.util.Util.API_KEY_IS_NOT_ACTIVATED;
import static com.weather.forecast.util.Util.CHECKED_API_KEY_MESSAGE;
import static com.weather.forecast.util.Util.CITY_NAME_WRONG_FORMAT;
import static com.weather.forecast.util.Util.ERROR_RESPONSE;
import static com.weather.forecast.util.Util.EXCEEDED_THE_LIMIT_OF_CALLS_MESSAGE;
import static com.weather.forecast.util.Util.FORMAT_CITY_NAME_INCORRECT_MESSAGE;
import static com.weather.forecast.util.Util.OK_RESPONSE;
import static com.weather.forecast.util.Util.SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_1;
import static com.weather.forecast.util.Util.SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_2;
import static com.weather.forecast.util.Util.SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_3;
import static com.weather.forecast.util.Util.SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_4;
import static com.weather.forecast.util.Util.SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_MESSAGE;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hfredi35@gmail.com
 */
@RestController
@CrossOrigin
public class WeatherInformationController {

    @Autowired
    private WeatherInformationService weatherInfoService;

    @PostMapping(value = "/getCurrentWeatherForecast")
    public WeatherForecastResponse getCurrentWeatherForecastByCityName(@RequestBody final Map<String, Object> map) {
        WeatherForecastResponse weatherForecastResponse;
        ForecastWeather forecastWeather = weatherInfoService.getCurrentWeatherForecastByCityName((String) map.get("cityName"));

        if (forecastWeather != null) {
            if (forecastWeather.getStatusCode() == 0) {
                weatherForecastResponse = new WeatherForecastResponse(OK_RESPONSE, forecastWeather);
            } else {
                switch (forecastWeather.getStatusCode()) {
                    case API_KEY_IS_NOT_ACTIVATED:
                        weatherForecastResponse = new WeatherForecastResponse(ERROR_RESPONSE, CHECKED_API_KEY_MESSAGE);
                        break;
                    case CITY_NAME_WRONG_FORMAT:
                        weatherForecastResponse = new WeatherForecastResponse(ERROR_RESPONSE, FORMAT_CITY_NAME_INCORRECT_MESSAGE);
                        break;
                    case ACCOUNT_TEMPORARY_BLOCKED_EXCEEDING_OF_REQUESTS:
                        weatherForecastResponse = new WeatherForecastResponse(ERROR_RESPONSE, EXCEEDED_THE_LIMIT_OF_CALLS_MESSAGE);
                        break;
                    case SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_1:
                        weatherForecastResponse = new WeatherForecastResponse(String.valueOf(forecastWeather.getStatusCode()), SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_MESSAGE, forecastWeather);
                        break;
                    case SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_2:
                        weatherForecastResponse = new WeatherForecastResponse(String.valueOf(forecastWeather.getStatusCode()), SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_MESSAGE, forecastWeather);
                        break;
                    case SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_3:
                        weatherForecastResponse = new WeatherForecastResponse(String.valueOf(forecastWeather.getStatusCode()), SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_MESSAGE, forecastWeather);
                        break;
                    case SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_4:
                        weatherForecastResponse = new WeatherForecastResponse(String.valueOf(forecastWeather.getStatusCode()), SERVICE_UNAVAILABLE_CONTACT_US_FOR_ASSISTENCE_MESSAGE, forecastWeather);
                        break;
                    default:
                        weatherForecastResponse = new WeatherForecastResponse(ERROR_RESPONSE, new AssertionError());
                }
            }
        } else {
            weatherForecastResponse = new WeatherForecastResponse(ERROR_RESPONSE, "The model ForecastWeather value, is: " + forecastWeather);
        }
        return weatherForecastResponse;
    }
}
