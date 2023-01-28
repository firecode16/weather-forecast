package com.weather.forecast.service;

import com.weather.forecast.model.ForecastWeather;
import com.weather.forecast.repository.WeatherHistoricalSummaryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hfredi35@gmail.com
 */
@Service
public class WeatherHistoricalSummaryService {

    @Autowired
    private WeatherHistoricalSummaryRepository weatherHistoricalSummaryRepository;

    @Transactional(readOnly = true)
    public List<ForecastWeather> getHistoricalSummary() {
        List<ForecastWeather> lstModel = weatherHistoricalSummaryRepository.findAll();
        return lstModel;
    }
}
