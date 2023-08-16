import pages.BaseFunc;
import pages.HomePage;
import pages.PassengerInfoPage;
import pages.SeatSelectionPage;
import model.ReservationInfo;
import org.junit.jupiter.api.Test;

public class TicketsTestsOnPages {
    private final String URL = "www.qaguru.lv:8089/tickets";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";
    private int seatNr = 28;
    private ReservationInfo info = new ReservationInfo("Victoria", "Maksimova", "36352", 2, 1, 0, "15-05-2018");


     @Test
    public void successTicketBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectDepartureAirport(DEPARTURE_AIRPORT);
        homePage.selectArrivalAirport(ARRIVAL_AIRPORT);
        homePage.clickGoGoGoBtn();

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(info);
        infoPage.clickGetPrice();
        infoPage.clickBook();

        //Assertions.assertEquals(DEPARTURE_AIRPORT, infoPage.getDepartureAirport(), "Error!"  );
       //Assertions.assertEquals(DEPARTURE_AIRPORT, infoPage.getDepartureAirport(), "Error!"  );

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage((baseFunc));
        seatSelectionPage.selectSeat(seatNr);


    }


}
