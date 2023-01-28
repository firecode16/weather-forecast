package com.weather.forecast.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hfredi35@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonRain {

    @JsonProperty("1h")
    private Double rain1h;
    @JsonProperty("3h")
    private Double rain3h;

    public Double getRain1h() {
        return rain1h;
    }

    public void setRain1h(Double rain1h) {
        this.rain1h = rain1h;
    }

    public Double getRain3h() {
        return rain3h;
    }

    public void setRain3h(Double rain3h) {
        this.rain3h = rain3h;
    }

}
