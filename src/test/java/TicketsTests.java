import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_CODE_INPUT = By.id("discount");
    private final By ADULTS_COUNT_INPUT = By.id("adults");
    private final By CHILDREN_COUNT_INPUT = By.id("children");
    private final By LUGGAGE_COUNT_INPUT = By.id("bugs");
    private final By NEXT_FLIGHT = By.id("flight");
    private final By GET_PRICE_LIMK = By.xpath(".//span[@onclick = 'setLang();']");
    private final By SELECTED_AIRPORT = By.xpath(".//span[@class='bTxt']");
    private final By BOOK_LINK = By.id("book2");
    //private final By SEAT_LINK = By.
    private final By FlIGHT_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final By SEAT_LINK = By.id ("book");


    private final String URL = "http://www.qaguru.lv:8089/tickets";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";
    private final String NAME = "Victoria";
    private final String SURNAME = "Maksimova";
    private final String DISCOUNT_CODE = "365437-233746";
    private final String ADULTS = "2";
    private final String CHILDREN = "1";
    private final String BUGS = "0";
    private final String FLIGHT = "15";

    @Test
    public void successTicketsBookCheck() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(URL);

        WebElement fromDropdown = browser.findElement(FROM);
        Select fromSelect = new Select(fromDropdown);
        fromSelect.selectByValue(DEPARTURE_AIRPORT);

        WebElement toDropdown = browser.findElement(TO);
        Select toSelect = new Select(toDropdown);
        toSelect.selectByValue(ARRIVAL_AIRPORT);

        browser.findElement(GO_BTN).click();





        WebElement nameInputField = browser.findElement(NAME_INPUT);
        nameInputField.clear();
        nameInputField.sendKeys(NAME);

        WebElement surnameInputField = browser.findElement(SURNAME_INPUT);
        surnameInputField.clear();
        surnameInputField.sendKeys(SURNAME);

        WebElement discountCodeInputField = browser.findElement(DISCOUNT_CODE_INPUT);
        discountCodeInputField.clear();
        discountCodeInputField.sendKeys(DISCOUNT_CODE);

        WebElement adultsInputField = browser.findElement(ADULTS_COUNT_INPUT);
        adultsInputField.clear();
        adultsInputField.sendKeys(ADULTS);

        WebElement childrenInputField = browser.findElement(CHILDREN_COUNT_INPUT);
        childrenInputField.clear();
        childrenInputField.sendKeys(CHILDREN);

        WebElement luggageInputField = browser.findElement(LUGGAGE_COUNT_INPUT);
        luggageInputField.clear();
        luggageInputField.sendKeys(BUGS);

        WebElement nextFlightField = browser.findElement(NEXT_FLIGHT);
        Select flightSelect = new Select(nextFlightField);
        flightSelect.selectByValue(FLIGHT);

        browser.findElement(GET_PRICE_LIMK).click();

        WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBe(FlIGHT_INFO, 5));

        List<WebElement> flightInfo = browser.findElements(FlIGHT_INFO);
        Assertions.assertEquals(DEPARTURE_AIRPORT,flightInfo.get(0).getText(), "Wrong departure airoport!");
        Assertions.assertEquals(ARRIVAL_AIRPORT, flightInfo.get(1).getText(), "Wrong arrival airoport!");

        String name = flightInfo.get(2).getText();
        Assertions.assertEquals(NAME, name.substring(0, name.length() -1), "Wrong name");

        Assertions.assertEquals(DEPARTURE_AIRPORT,flightInfo.get(3).getText(), "ERROR2 Wrong departure airoport!");
        Assertions.assertEquals(ARRIVAL_AIRPORT, flightInfo.get(4).getText(), "ERROR2 Wrong arrival airoport!");

        browser.findElement(BOOK_LINK).click();

       //List<WebElement> seat = browser.findElements(SEAT_LINK);
       //Select seat = new Select(seat);
       //seat.get(25);


        //browser.findElement(SEAT_LINK).click();






    }
}
