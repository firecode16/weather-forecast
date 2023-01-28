package com.weather.forecast.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hfredi35@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonSystem {

    @JsonProperty("type")
    private Long sysType;
    @JsonProperty("id")
    private Long sysId;
    @JsonProperty("message")
    private Double sysMessage;
    @JsonProperty("country")
    private String sysCountry;
    @JsonProperty("sunrise")
    private Long sysSunrise;
    @JsonProperty("sunset")
    private Long sysSunset;

    public Long getSysType() {
        if (sysType == null) {
            sysType = 0L;
        }
        return sysType;
    }

    public void setSysType(Long sysType) {
        this.sysType = sysType;
    }

    public Long getSysId() {
        if (sysId == null) {
            sysId = 0L;
        }
        return sysId;
    }

    public void setSysId(Long sysId) {
        this.sysId = sysId;
    }

    public Double getSysMessage() {
        if (sysMessage == null) {
            sysMessage = Double.NaN;
        }
        return sysMessage;
    }

    public void setSysMessage(Double sysMessage) {
        this.sysMessage = sysMessage;
    }

    public String getSysCountry() {
        return sysCountry;
    }

    public void setSysCountry(String sysCountry) {
        this.sysCountry = sysCountry;
    }

    public Long getSysSunrise() {
        return sysSunrise;
    }

    public void setSysSunrise(Long sysSunrise) {
        this.sysSunrise = sysSunrise;
    }

    public Long getSysSunset() {
        return sysSunset;
    }

    public void setSysSunset(Long sysSunset) {
        this.sysSunset = sysSunset;
    }

}
