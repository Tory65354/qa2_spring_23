package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public WeatherDetails getCurrent() {
        return current;
    }

    public void setCurrent(WeatherDetails current) {
        this.current = current;
    }

    public List<Minutely> getMinutelyList() {
        return minutelyList;
    }

    public void setMinutelyList(List<Minutely> minutelyList) {
        this.minutelyList = minutelyList;
    }

    public List<WeatherDetails> getHourly() {
        return hourly;
    }

    public void setHourly(List<WeatherDetails> hourly) {
        this.hourly = hourly;
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public void setDaily(List<Daily> daily) {
        this.daily = daily;
    }

    private double lat;
    private double lon;
    private String timezone;

    @JsonProperty("timezone_offset")
    private int timezoneOffset;

    private WeatherDetails current;

    @JsonProperty ("minutely")
    private List<Minutely> minutelyList;

    private List <WeatherDetails> hourly;

    private List<Daily> daily;










}
