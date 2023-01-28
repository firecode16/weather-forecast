package com.weather.forecast.mapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hfredi35@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonForecast {

    @JsonProperty("coord")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonCoord> coord = new ArrayList<>();
    @JsonProperty("weather")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonWeather> weather = new ArrayList<>();
    @JsonProperty("base")
    private String base;
    @JsonProperty("main")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonMain> main = new ArrayList<>();
    @JsonProperty("visibility")
    private Long visibility;
    @JsonProperty("wind")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonWind> wind = new ArrayList<>();
    @JsonProperty("clouds")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonClouds> clouds = new ArrayList<>();
    @JsonProperty("rain")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonRain> rain = new ArrayList<>();
    @JsonProperty("snow")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonSnow> snow = new ArrayList<>();
    @JsonProperty("dt")
    private Long timeDataCalc;
    @JsonProperty("sys")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<JsonSystem> sys = new ArrayList<>();
    @JsonProperty("timezone")
    private String timeZone;
    @JsonProperty("id")
    private Long cityId;
    @JsonProperty("name")
    private String cityName;
    @JsonProperty("cod")
    private Long code;

    public List<JsonCoord> getCoord() {
        return coord;
    }

    public void setCoord(List<JsonCoord> coord) {
        this.coord = coord;
    }

    public List<JsonWeather> getWeather() {
        return weather;
    }

    public void setWeather(List<JsonWeather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<JsonMain> getMain() {
        return main;
    }

    public void setMain(List<JsonMain> main) {
        this.main = main;
    }

    public Long getVisibility() {
        return visibility;
    }

    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

    public List<JsonWind> getWind() {
        return wind;
    }

    public void setWind(List<JsonWind> wind) {
        this.wind = wind;
    }

    public List<JsonClouds> getClouds() {
        return clouds;
    }

    public void setClouds(List<JsonClouds> clouds) {
        this.clouds = clouds;
    }

    public List<JsonRain> getRain() {
        return rain;
    }

    public void setRain(List<JsonRain> rain) {
        this.rain = rain;
    }

    public List<JsonSnow> getSnow() {
        return snow;
    }

    public void setSnow(List<JsonSnow> snow) {
        this.snow = snow;
    }

    public Long getTimeDataCalc() {
        return timeDataCalc;
    }

    public void setTimeDataCalc(Long timeDataCalc) {
        this.timeDataCalc = timeDataCalc;
    }

    public List<JsonSystem> getSys() {
        return sys;
    }

    public void setSys(List<JsonSystem> sys) {
        this.sys = sys;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

}
