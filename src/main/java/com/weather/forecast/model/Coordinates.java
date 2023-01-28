package com.weather.forecast.model;

import java.io.Serializable;

/**
 *
 * @author hfredi35@gmail.com
 */
public class Coordinates implements Serializable {

    private Double longitude;
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
