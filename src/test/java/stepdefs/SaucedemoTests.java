package stepdefs;

import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.LoginPage;

public class SaucedemoTests {
    private final String URL = "www.saucedemo.com/";
    private final String LOGIN_1 = "standard_user";
    private final String VALIDATE_PASSWORD = "secret_sauce";
    private final String WRONG_PASSWORD = "wrong123";




    @Test
    public void successLogin () {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        LoginPage loginPage = new LoginPage(baseFunc);
        loginPage.fillInLogin(LOGIN_1);
        loginPage.fillInPassword(VALIDATE_PASSWORD);
        loginPage.clickLoginBtn();

    }

    @Test
    public void wrongPassword (){
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        LoginPage loginPage = new LoginPage(baseFunc);
        loginPage.fillInLogin(LOGIN_1);
        loginPage.fillInPassword(WRONG_PASSWORD);
        loginPage.clickLoginBtn();
    }

}
