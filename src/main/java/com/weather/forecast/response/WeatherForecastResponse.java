package com.weather.forecast.response;

/**
 *
 * @author hfredi35@gmail.com
 */
public class WeatherForecastResponse {

    private String result;
    private String message;
    private Object data;

    public WeatherForecastResponse() {
    }

    public WeatherForecastResponse(String result, Object data) {
        this.result = result;
        this.data = data;
    }

    public WeatherForecastResponse(String result, String message) {
        this.result = result;
        this.message = message;
    }

    public WeatherForecastResponse(String result, String message, Object data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
