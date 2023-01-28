package com.weather.forecast.model;

import java.io.Serializable;

/**
 *
 * @author hfredi35@gmail.com
 */
public class Rain implements Serializable {

    private Double rain1h;
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
