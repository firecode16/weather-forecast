package com.weather.forecast.service;

import com.weather.forecast.apiclient.WeatherInformationApiClient;
import com.weather.forecast.mapper.JsonForecast;
import com.weather.forecast.model.Clouds;
import com.weather.forecast.model.Coordinates;
import com.weather.forecast.model.ForecastWeather;
import com.weather.forecast.model.Main;
import com.weather.forecast.model.Rain;
import com.weather.forecast.model.Snow;
import com.weather.forecast.model.Sys;
import com.weather.forecast.model.Weather;
import com.weather.forecast.model.Wind;
import com.weather.forecast.repository.WeatherInformationRepository;
import feign.FeignException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hfredi35@gmail.com
 */
@Service
public class WeatherInformationService {

    @Autowired
    private WeatherInformationApiClient weatherInfoApiClient;

    @Autowired
    private WeatherInformationRepository weatherInfoRepository;

    private ForecastWeather forecastWeather = new ForecastWeather();

    @Transactional
    public ForecastWeather getCurrentWeatherForecastByCityName(String cityName) {
        try {
            JsonForecast jsonForecast = weatherInfoApiClient.getCurrentWeatherForecastByCityName(cityName);
            forecastWeather = saveForecastWeather(jsonForecast);
        } catch (FeignException ex) {
            System.err.println("-- FALLO EL CONSUMO --> " + "status: " + ex.status() + ", CAUSE: " + ex.getLocalizedMessage());
            forecastWeather = getTheLastConsultedWeatherForecast(ex.status());
        }
        return forecastWeather;
    }

    @Transactional
    private ForecastWeather saveForecastWeather(JsonForecast jsonForecast) {
        forecastWeather = new ForecastWeather();
        forecastWeather.setCityId(jsonForecast.getCityId());
        forecastWeather.setCityName(jsonForecast.getCityName());
        forecastWeather.setTimeZone(jsonForecast.getTimeZone());
        forecastWeather.setTimeDataCalc(jsonForecast.getTimeDataCalc());
        forecastWeather.setRegisterDate(Timestamp.valueOf(LocalDateTime.now()));

        Coordinates coordinates = new Coordinates();
        Double longitude = jsonForecast.getCoord().stream().map(json -> json.getLongitude()).findFirst().orElse(null);
        Double latitude = jsonForecast.getCoord().stream().map(json -> json.getLatitude()).findFirst().orElse(null);
        coordinates.setLongitude(longitude);
        coordinates.setLatitude(latitude);

        Weather weather = new Weather();
        weather.setId(jsonForecast.getWeather().stream().map(json -> json.getWeatherId()).findFirst().orElse(null));
        weather.setMain(jsonForecast.getWeather().stream().map(json -> json.getWeatherMain()).findFirst().orElse(null));
        weather.setDescription(jsonForecast.getWeather().stream().map(json -> json.getWeatherDescription()).findFirst().orElse(null));
        weather.setIcon(jsonForecast.getWeather().stream().map(json -> json.getWeatherIcon()).findFirst().orElse(null));

        Main main = new Main();
        Double temperature = jsonForecast.getMain().stream().map(json -> json.getTemperature()).findFirst().orElse(null);
        Double feelsLike = jsonForecast.getMain().stream().map(json -> json.getFeelsLike()).findFirst().orElse(null);
        Long pressure = jsonForecast.getMain().stream().map(json -> json.getPressure()).findFirst().orElse(null);
        Long humidity = jsonForecast.getMain().stream().map(json -> json.getHumidity()).findFirst().orElse(null);
        Double tempMin = jsonForecast.getMain().stream().map(json -> json.getTempMin()).findFirst().orElse(null);
        Double tempMax = jsonForecast.getMain().stream().map(json -> json.getTempMax()).findFirst().orElse(null);
        Double seaLevel = jsonForecast.getMain().stream().map(json -> json.getSeaLevel()).findFirst().orElse(null);
        Double groundLevel = jsonForecast.getMain().stream().map(json -> json.getGroundLevel()).findFirst().orElse(null);
        main.setTemp(temperature);
        main.setFeels_like(feelsLike);
        main.setPressure(pressure);
        main.setHumidity(humidity);
        main.setTemp_min(tempMin);
        main.setTemp_max(tempMax);
        main.setSea_level(seaLevel);
        main.setGrnd_level(groundLevel);

        Wind wind = new Wind();
        wind.setSpeed(jsonForecast.getWind().stream().map(json -> json.getWindSpeed()).findFirst().orElse(null));
        wind.setDeg(jsonForecast.getWind().stream().map(json -> json.getWindDirection()).findFirst().orElse(null));
        wind.setGust(jsonForecast.getWind().stream().map(json -> json.getWindGust()).findFirst().orElse(null));

        Clouds clouds = new Clouds();
        clouds.setAll(jsonForecast.getClouds().stream().map(json -> json.getAllClouds()).findFirst().orElse(null));

        Rain rain = new Rain();
        rain.setRain1h(jsonForecast.getRain().stream().map(json -> json.getRain1h()).findFirst().orElse(null));
        rain.setRain3h(jsonForecast.getRain().stream().map(json -> json.getRain3h()).findFirst().orElse(null));

        Snow snow = new Snow();
        snow.setSnow1h(jsonForecast.getSnow().stream().map(json -> json.getSnow1h()).findFirst().orElse(null));
        snow.setSnow3h(jsonForecast.getSnow().stream().map(json -> json.getSnow3h()).findFirst().orElse(null));

        Sys sys = new Sys();
        sys.setType(jsonForecast.getSys().stream().map(json -> json.getSysType()).findFirst().orElse(null));
        sys.setId(jsonForecast.getSys().stream().map(json -> json.getSysId()).findFirst().orElse(null));
        sys.setMessage(jsonForecast.getSys().stream().map(json -> json.getSysMessage()).findFirst().orElse(null));
        sys.setCountry(jsonForecast.getSys().stream().map(json -> json.getSysCountry()).findFirst().orElse(null));
        sys.setSunrise(jsonForecast.getSys().stream().map(json -> json.getSysSunrise()).findFirst().orElse(null));
        sys.setSunset(jsonForecast.getSys().stream().map(json -> json.getSysSunset()).findFirst().orElse(null));

        forecastWeather.setCoordinates(coordinates);
        forecastWeather.setWeather(weather);
        forecastWeather.setMain(main);
        forecastWeather.setWind(wind);
        forecastWeather.setClouds(clouds);
        forecastWeather.setRain(rain);
        forecastWeather.setSnow(snow);
        forecastWeather.setSys(sys);

        final ForecastWeather result = weatherInfoRepository.save(forecastWeather);
        return result;
    }

    @Transactional
    private ForecastWeather getTheLastConsultedWeatherForecast(int statusCode) {
        if (statusCode == 500 || statusCode == 502 || statusCode == 503 || statusCode == 504) {
            forecastWeather = weatherInfoRepository.findFirstByOrderByRegisterDateDesc();

            if (forecastWeather == null) {
                forecastWeather = new ForecastWeather();
                forecastWeather.setStatusCode(statusCode);
            } else {
                forecastWeather.setStatusCode(statusCode);
            }
        }
        return forecastWeather;
    }
}
