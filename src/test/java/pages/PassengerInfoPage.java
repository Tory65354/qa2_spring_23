package pages;

import model.ReservationInfo;
import org.openqa.selenium.By;

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


    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInPassengerInfo(ReservationInfo reservationInfo) {
        baseFunc.type(NAME_INPUT,reservationInfo.getFirstName());
        baseFunc.type(SURNAME_INPUT,reservationInfo.getLastName());
        baseFunc.type(DISCOUNT_CODE_INPUT,reservationInfo.getDiscount());
        baseFunc.type(ADULTS_COUNT_INPUT,reservationInfo.getPassengerCount());
        baseFunc.type(CHILDREN_COUNT_INPUT,reservationInfo.getChildCount());
        baseFunc.type(LUGGAGE_COUNT_INPUT,reservationInfo.getBagsCount());
        baseFunc.selectByText(NEXT_FLIGHT, reservationInfo.getFlightDate());

    }
    public void clickGetPrice() {baseFunc.click(GET_PRICE_LINK);}

    public void clickBook() {baseFunc.click(BOOK_LINK);}

    public String getDepartureAirport() {
        String airport = "";
        //Finding element by locator
        //getting text
        return airport;
    }


}
