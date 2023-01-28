package com.weather.forecast.controller;

import com.weather.forecast.model.ForecastWeather;
import com.weather.forecast.response.WeatherForecastResponse;
import com.weather.forecast.service.WeatherInformationService;
import static com.weather.forecast.util.Util.ERROR_RESPONSE;
import static com.weather.forecast.util.Util.OK_RESPONSE;
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
        String cityName = (String) map.get("cityName");
        ForecastWeather forecastWeather = weatherInfoService.getCurrentWeatherForecastByCityName(cityName);

        if (forecastWeather != null && forecastWeather.getCityId() != 0L) {
            weatherForecastResponse = new WeatherForecastResponse(OK_RESPONSE, forecastWeather);
        } else {
            weatherForecastResponse = new WeatherForecastResponse(ERROR_RESPONSE, "El servioio regreso vacio");
        }

        return weatherForecastResponse;
    }
}
