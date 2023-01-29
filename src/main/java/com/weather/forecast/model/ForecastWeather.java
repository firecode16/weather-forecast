package com.weather.forecast.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.Type;

/**
 *
 * @author hfredi35@gmail.com
 */
@Entity
@Table(name = "forecast_weather")
public class ForecastWeather extends BaseEntity implements Serializable {

    @Id
    @Column(name = "city_id")
    private Long cityId;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "time_zone")
    private String timeZone;
    @Column(name = "time_data_calc")
    private Long timeDataCalc;
    @Column(name = "register_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

    @Type(type = "json")
    @Column(name = "coordinates", columnDefinition = "json")
    private Coordinates coordinates;

    @Type(type = "json")
    @Column(name = "weather", columnDefinition = "json")
    private Weather weather;

    @Type(type = "json")
    @Column(name = "main", columnDefinition = "json")
    private Main main;

    @Type(type = "json")
    @Column(name = "wind", columnDefinition = "json")
    private Wind wind;

    @Type(type = "json")
    @Column(name = "clouds", columnDefinition = "json")
    private Clouds clouds;

    @Type(type = "json")
    @Column(name = "rain", columnDefinition = "json")
    private Rain rain;

    @Type(type = "json")
    @Column(name = "snow", columnDefinition = "json")
    private Snow snow;

    @Type(type = "json")
    @Column(name = "sys", columnDefinition = "json")
    private Sys sys;

    @Transient
    @JsonIgnore
    private int statusCode;

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

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Long getTimeDataCalc() {
        return timeDataCalc;
    }

    public void setTimeDataCalc(Long timeDataCalc) {
        this.timeDataCalc = timeDataCalc;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}
