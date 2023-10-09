package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.ticket.Reservations;
import pages.*;
import model.ticket.FlightInfo;
import model.ticket.Passenger;
import org.junit.jupiter.api.Assertions;
import requesters.TicketsRequester;

import java.util.List;
import java.util.Map;

public class TicketsStepDefs {
    private Passenger passenger = new Passenger();
    private FlightInfo flight = new FlightInfo();
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private PassengerInfoPage infoPage;
    private SeatSelectionPage selectionPage;
    private BookPage bookPage;
    private List<Reservations> reservations;
    private Reservations reservationFromApi;

    @Given("airports:")
    public void set_airports(Map<String, String> params) {
        flight.setDeparture(params.get("from"));
        flight.setArrival(params.get("to"));
    }

    @Given("passenger info is:")
    public void set_passenger_info(Map<String, String> params) {
        passenger.setFirstName(params.get("first_name"));
        passenger.setLastName(params.get("last_name"));
    }

    @Given("flight info is:")
    public void set_flight_info(Map<String, String> params) {
        flight.setDiscount(params.get("discount"));
        flight.setPassengersCount(Integer.parseInt(params.get("passenger_count")));
        flight.setChildCount(Integer.parseInt(params.get("child_count")));
        flight.setLuggageCount(Integer.parseInt(params.get("luggage_count")));
        flight.setFlightDate(params.get("flight_date"));
        flight.setSeatNr(Integer.parseInt(params.get("seat_nr")));
    }

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl("www.qaguru.lv:8089/tickets");
        homePage = new HomePage(baseFunc);
    }

    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectDepartureAirport(flight.getDeparture());
        homePage.selectArrivalAirport(flight.getArrival());
        homePage.clickGoGoGoBtn();
        infoPage = new PassengerInfoPage(baseFunc);
    }

    @Then("selected airports appears on the passenger info page")
    public void selected_airports_appears_check() {
        Assertions.assertEquals(flight.getDeparture(), infoPage.getDepartureAirport(), "Incorrect departure airports on the info page");
        Assertions.assertEquals(flight.getArrival(), infoPage.getArrivalAirport(), "Incorrect arrival airports on the info page");
    }

    @When("we are filling in passenger info")
    public void fill_info() {
        infoPage.fillInPassengerInfo(flight, passenger);
    }

    @And("requesting price")
    public void get_price() {
        infoPage.clickGetPrice();
    }

    @Then("airports and price appears in flight details")
    public void flight_details_check() {
        Assertions.assertEquals(flight.getDeparture(), infoPage.getDepartureAirport(), "Wrong Departure Airport!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getArrivalAirport(), "Wrong Arrival Airport!");
        Assertions.assertEquals(passenger.getFirstName(), infoPage.FirstName(), "Wrong First Name");
        Assertions.assertEquals(flight.getDeparture(), infoPage.getDeparture(), "Wrong Departure Airport two!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getArrival(), "Wrong Arrival Airport two!");
    }

    @When("we are confirming price")
    public void confirm_price() {
        infoPage.clickBook();
        selectionPage = new SeatSelectionPage(baseFunc);
    }

    @And("selecting seat number")
    public void selecting_seat() {
        selectionPage.selectSeat(flight.getSeatNr());
    }

    @Then("selected seat number appears")
    public void selected_seat_check() {
        Assertions.assertEquals(selectionPage.checkSeatLink(), "Your seat is: 28", "Incorrect Seat Number!");
    }

    @When("we are confirming seat")
    public void confirming_seat() {
        bookPage = new BookPage(baseFunc);
        bookPage.clickBookLink();
    }

    @Then("successful registration message appears")
    public void registration_message_check() {
        Assertions.assertTrue(bookPage.getMessage(), "Registration message failed");
    }

    @When("we are requesting all reservation via API")
    public void request_all_reservations() throws JsonProcessingException {
        TicketsRequester requester = new TicketsRequester();
        reservations = requester.getReservations();
    }

    @Then("current reservation exists in the list")
    public void find_reservation() {
        for (Reservations reservation : reservations) {
            if (reservation.getName().equals(passenger.getFirstName())) {
                reservationFromApi = reservation;
                break;
            }
        }
        Assertions.assertNotNull(reservationFromApi, "Can't find reservation!");
    }

    @Then("all data are stored correctly")
    public void check_reservation_data() {
        Assertions.assertEquals(passenger.getLastName(), reservationFromApi.getSurname(), "Wrong Last name!");
        Assertions.assertEquals(flight.getSeatNr(), reservationFromApi.getSeat(), "wrong Seat number!");
    }
}
