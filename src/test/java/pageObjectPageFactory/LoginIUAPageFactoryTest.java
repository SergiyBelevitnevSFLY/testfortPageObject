package pageObjectPageFactory;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.LoginIUAPageFactory;

public class LoginIUAPageFactoryTest extends BaseTest {

    @Test
    public void pageFactory(){

        getWebDriver().get("https://passport.i.ua/login/");

        LoginIUAPageFactory loginIUAPageFactoryTest = new LoginIUAPageFactory(getWebDriver());
        loginIUAPageFactoryTest.login("testfort.summer2021@i.ua","testfort2021");
        log("Logged In with Credentials \"testfort.summer2021@i.ua\" \"testfort2021\"");

        System.out.println("");

    }
}
