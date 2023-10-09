package pages;

import model.ticket.FlightInfo;
import model.ticket.Passenger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PassengerInfoPage {
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_CODE_INPUT = By.id("discount");
    private final By ADULTS_COUNT_INPUT = By.id("adults");
    private final By CHILDREN_COUNT_INPUT = By.id("children");
    private final By LUGGAGE_COUNT_INPUT = By.id("bugs");
    private final By NEXT_FLIGHT = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");
    private final By BOOK_LINK = By.id("book2");
    private final By FLIGHT_INFO = By.xpath(".//span[@class='bTxt']");


    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInPassengerInfo(FlightInfo flight, Passenger passenger) {
        baseFunc.type(NAME_INPUT, passenger.getFirstName());
        baseFunc.type(SURNAME_INPUT, passenger.getLastName());
        baseFunc.type(DISCOUNT_CODE_INPUT, flight.getDiscount());
        baseFunc.type(ADULTS_COUNT_INPUT, flight.getPassengersCount());
        baseFunc.type(CHILDREN_COUNT_INPUT, flight.getChildCount());
        baseFunc.type(LUGGAGE_COUNT_INPUT, flight.getLuggageCount());
        baseFunc.selectByText(NEXT_FLIGHT, flight.getFlightDate());
    }

    public void clickGetPrice() {
        baseFunc.click(GET_PRICE_LINK);
    }

    public void clickBook() {baseFunc.click(BOOK_LINK);}

    public String getDepartureAirport() {return baseFunc.waitForNumbersOfElementsToBe(FLIGHT_INFO, 5).get(0).getText();}

    public String getArrivalAirport() {
        return baseFunc.waitForNumbersOfElementsToBe(FLIGHT_INFO, 5).get(1).getText();
    }

    public String FirstName() {
        return baseFunc.waitForNumbersOfElementsToBe(FLIGHT_INFO, 5).get(2).getText();
    }

    public String getDeparture() {
        return baseFunc.waitForNumbersOfElementsToBe(FLIGHT_INFO, 5).get(3).getText();
    }

    public String getArrival() {
        return baseFunc.waitForNumbersOfElementsToBe(FLIGHT_INFO, 5).get(4).getText();
    }
}



