import org.testng.annotations.Test;

public class LoginIUAPageFactoryTest extends BaseTest{

    @Test
    public void pageFactory(){

        getWebDriver().get("https://passport.i.ua/login/");
        LoginIUAPageFactory loginIUAPageFactoryTest = new LoginIUAPageFactory(getWebDriver());
        loginIUAPageFactoryTest.login("testfort.summer2021@i.ua","testfort2021");

    }
}
