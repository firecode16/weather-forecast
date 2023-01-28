package com.weather.forecast.repository;

import com.weather.forecast.model.ForecastWeather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hfredi35@gmail.com
 */
@Repository
public interface WeatherInformationRepository extends CrudRepository<ForecastWeather, Long> {
}
