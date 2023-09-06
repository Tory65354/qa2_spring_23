package stepdefs;

import dev.failsafe.internal.util.Assert;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.weather.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.HashMap;
import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response;

    @Given("city ID is {long}")
    public void set_city_id(long cityId) {
        this.cityId = cityId;


    }

    @When("we are requesting weather forecast")
    //ALT+ENTER
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("latitude is {double}")
    public void latitude_check(double latitude) {
        Assertions.assertEquals(latitude, response.getLat(), "Incorrect Latitudde!");
    }

    @Then("longitude is {double}")
    public void longitude_check(double longitude) {
        Assertions.assertEquals(longitude, response.getLon(), "Incorrect Longitude!");
    }

    @Then("timezone is {string}")
    public void timezone_check(String timezone) {
        Assertions.assertEquals(timezone, response.getTimezone(), "Incorrect Timezone!");
    }

    @Then("timezone offset is {int}")
    public void timezone_offset_check(int offset) {
        Assertions.assertEquals(offset, response.getTimezoneOffset(), "Inccorect Offset");
    }

    @Then("current weather data is:")
    public void current_weather_check(Map<String, String> params) {
        Assertions.assertEquals(Long.parseLong(params.get("dt")), response.getCurrent().getDt(), "Incorrect DT");
        Assertions.assertEquals(Long.parseLong(params.get("sunrise")), response.getCurrent().getSunrise(), "Incorrect Sunrise");
        Assertions.assertEquals(Long.parseLong(params.get("sunset")), response.getCurrent().getSunset(), "Incorrect Sunset");
        Assertions.assertEquals(Double.parseDouble(params.get("temp")), response.getCurrent().getTemp(), "Incorrect Temperature");
        Assertions.assertEquals(Double.parseDouble(params.get("feels like")), response.getCurrent().getFeelsLike(), "Incorrect Feels Like");
        Assertions.assertEquals(Integer.parseInt(params.get("pressure")), response.getCurrent().getPressure(), "Incorrect Pressure");
        Assertions.assertEquals(Integer.parseInt(params.get("humidity")), response.getCurrent().getHumidity(), "Incorrect Humidity");
        Assertions.assertEquals(Double.parseDouble(params.get("dew point")), response.getCurrent().getDewPoint(), "Incorrect Dew Point");
        Assertions.assertEquals(Double.parseDouble(params.get("uvi")), response.getCurrent().getUvi(), "");
        Assertions.assertEquals(Integer.parseInt(params.get("clouds")), response.getCurrent().getClouds(), "");
        Assertions.assertEquals(Integer.parseInt(params.get("visibility")), response.getCurrent().getVisibility(), "");
        Assertions.assertEquals(Double.parseDouble(params.get("wind speed")), response.getCurrent().getWindSpeed(), "");
        Assertions.assertEquals(Integer.parseInt(params.get("wind deg")), response.getCurrent().getWindDeg(), "");
        Assertions.assertEquals(Double.parseDouble(params.get("wind gust")), response.getCurrent().getWindGust(), "");
    }

}
