package com.weather.forecast.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hfredi35@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonClouds {

    @JsonProperty("all")
    private Long allClouds;

    public Long getAllClouds() {
        return allClouds;
    }

    public void setAllClouds(Long allClouds) {
        this.allClouds = allClouds;
    }

}
