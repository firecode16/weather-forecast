package com.weather.forecast.model;

import java.io.Serializable;

/**
 *
 * @author hfredi35@gmail.com
 */
public class Snow implements Serializable {

    private Double snow1h;
    private Double snow3h;

    public Double getSnow1h() {
        return snow1h;
    }

    public void setSnow1h(Double snow1h) {
        this.snow1h = snow1h;
    }

    public Double getSnow3h() {
        return snow3h;
    }

    public void setSnow3h(Double snow3h) {
        this.snow3h = snow3h;
    }

}
