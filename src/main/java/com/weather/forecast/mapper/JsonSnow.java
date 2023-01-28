package com.weather.forecast.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hfredi35@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonSnow {

    @JsonProperty("1h")
    private Double snow1h;
    @JsonProperty("3h")
    private Double snow3h;

    public Double getSnow1h() {
        if (snow1h == null) {
            snow1h = Double.NaN;
        }
        return snow1h;
    }

    public void setSnow1h(Double snow1h) {
        this.snow1h = snow1h;
    }

    public Double getSnow3h() {
        if (snow3h == null) {
            snow3h = Double.NaN;
        }
        return snow3h;
    }

    public void setSnow3h(Double snow3h) {
        this.snow3h = snow3h;
    }

}
