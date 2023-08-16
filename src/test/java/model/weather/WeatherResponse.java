package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
    private double lat;
    private double lon;
    private String timezone;

    @JsonProperty("timezone_offset")
    private int timezoneOffset;

    private WeatherDetails current;

    @JsonProperty ("minutely")
    private List<Minutely> minutelyList;

   @JsonProperty ("hourly")
    private List<WeatherDetails> hourly;

   @JsonProperty ("daily")
    private List<Daily> daily;










}
