package pages;

import org.openqa.selenium.By;

public class BookPage {
    private final By BOOK_BTN = By.id("book3");
    private final By REGISTRATION_MESSAGE = By.xpath( ".//div[@class='finalTxt']");

    private BaseFunc baseFunc;

    public BookPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickBookLink() {
        baseFunc.click(BOOK_BTN);
    }

    public boolean getMessage() {
        return baseFunc.findElement(REGISTRATION_MESSAGE).isDisplayed(); }
}
