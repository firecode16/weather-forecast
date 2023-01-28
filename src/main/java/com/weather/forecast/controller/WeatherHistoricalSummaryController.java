package com.weather.forecast.controller;

import com.weather.forecast.response.WeatherForecastResponse;
import com.weather.forecast.service.WeatherHistoricalSummaryService;
import static com.weather.forecast.util.Util.OK_RESPONSE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hfredi35@gmail.com
 */
@RestController
@CrossOrigin
public class WeatherHistoricalSummaryController {

    @Autowired
    private WeatherHistoricalSummaryService weatherHistoricalSummaryService;

    @GetMapping("/getWeatherHistoricalSummary")
    public WeatherForecastResponse getHistoricalSummary() {
        return new WeatherForecastResponse(OK_RESPONSE, weatherHistoricalSummaryService.getHistoricalSummary());
    }
}
