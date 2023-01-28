package com.weather.forecast.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hfredi35@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonWind {

    @JsonProperty("speed")
    private Double windSpeed;
    @JsonProperty("deg")
    private Long windDirection;
    @JsonProperty("gust")
    private Double windGust;

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Long getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Long windDirection) {
        this.windDirection = windDirection;
    }

    public Double getWindGust() {
        if (windGust == null) {
            windGust = Double.NaN;
        }
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

}
