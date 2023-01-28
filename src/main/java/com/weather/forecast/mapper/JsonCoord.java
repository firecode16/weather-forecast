package com.weather.forecast.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hfredi35@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonCoord {

    @JsonProperty("lon")
    private Double longitude;
    @JsonProperty("lat")
    private Double latitude;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

}
