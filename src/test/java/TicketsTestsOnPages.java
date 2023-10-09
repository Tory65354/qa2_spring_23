import model.ticket.FlightInfo;
import model.ticket.Passenger;
import org.junit.jupiter.api.Assertions;
import pages.*;
import org.junit.jupiter.api.Test;

public class TicketsTestsOnPages {
    private final String URL = "www.qaguru.lv:8089/tickets";
    private Passenger passenger = new Passenger("Victoria", "Maksimova");
    private FlightInfo flight = new FlightInfo("RIX", "MEL", "36352", 2, 1,
            0, "15-05-2018", 28);

    @Test
    public void successTicketBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectDepartureAirport(flight.getDeparture());
        homePage.selectArrivalAirport(flight.getArrival());
        homePage.clickGoGoGoBtn();

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(flight, passenger);
        infoPage.clickGetPrice();
        infoPage.clickBook();

        Assertions.assertEquals(flight.getDeparture(), infoPage.getDepartureAirport(), "Wrong Departure Airport!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getArrivalAirport(), "Wrong Arrival Airport!");
        Assertions.assertEquals(passenger.getFirstName(), infoPage.FirstName().substring(0, infoPage.FirstName().length()-1), "Wrong name");
        Assertions.assertEquals(flight.getDeparture(), infoPage.getDeparture(), "Wrong Departure Airport!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getArrival(), "Wrong Arrival Airport!");

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(flight.getSeatNr());

        Assertions.assertEquals(seatSelectionPage.checkSeatLink(), "Your seat is: 28", "Incorrect Seat Number!");

        BookPage bookPage = new BookPage(baseFunc);
        bookPage.clickBookLink();

        Assertions.assertTrue(bookPage.getMessage(), "Registration message failed");
    }
}
