package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeatSelectionPage {
    private final By SEAT_LINK = By.xpath (".//div[@class = 'seat']");
    private BaseFunc baseFunc;

    public SeatSelectionPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void selectSeat(int seatNr) {
        baseFunc.waitForElementsCountToBeAtLeast(SEAT_LINK, 15);

        List <WebElement> seats = baseFunc.findElements(SEAT_LINK);

        Assertions.assertFalse(seats.isEmpty(), "There is no seats at all");
        boolean isSeatFound = false;
        for (WebElement seat : seats) {
            if (Integer.parseInt(seat.getText()) == seatNr) {
                seat.click();
                isSeatFound = true;
                break;
            }
        }
        Assertions.assertTrue(isSeatFound, "seat Nr" + seatNr + "is not found!");

    }
}
