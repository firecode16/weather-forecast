package com.weather.forecast.service;

import com.weather.forecast.model.ForecastWeather;
import com.weather.forecast.repository.WeatherHistoricalSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    private Pageable pageable;

    @Transactional(readOnly = true)
    public Page<ForecastWeather> getHistoricalSummary() {
        pageable = PageRequest.of(0, 10, Sort.by("registerDate").descending());
        Page<ForecastWeather> pageModel = weatherHistoricalSummaryRepository.findAll(pageable);
        return pageModel;
    }
}
