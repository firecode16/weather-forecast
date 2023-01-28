package com.weather.forecast.apiclient;

import com.weather.forecast.mapper.JsonForecast;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author hfredi35@gmail.com
 */
@FeignClient(name = "weatherInformationApiClient", url = "${current.weather.data.baseUrl}")
public interface WeatherInformationApiClient {

    @GetMapping(value = "/${current.weather.filter.name}q={cityName}&appid=${secret.api.key}")
    public JsonForecast getCurrentWeatherForecastByCityName(@PathVariable String cityName);
}
