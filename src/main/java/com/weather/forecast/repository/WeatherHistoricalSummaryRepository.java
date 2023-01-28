package com.weather.forecast.repository;

import com.weather.forecast.model.ForecastWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hfredi35@gmail.com
 */
@Repository
public interface WeatherHistoricalSummaryRepository extends JpaRepository<ForecastWeather, Long> {
}
