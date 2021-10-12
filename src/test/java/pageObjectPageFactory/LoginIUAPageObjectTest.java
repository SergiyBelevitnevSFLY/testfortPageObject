package pageObjectPageFactory;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.IUALoginPage;

public class LoginIUAPageObjectTest extends BaseTest {

    @Test(timeOut = 60000)
    public void iuaLoginPageObject(){

        getWebDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getWebDriver());
        iuaLoginPage.login("testfort.summer2021@i.ua","testfort2021");
        iuaLoginPage.isExitButtonPresent();
        log("Logged In with Credentials \"testfort.summer2021@i.ua\" \"testfort2021\"");
    }

    @Test
    public void iuaLoginPageObjectNegative(){

        getWebDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getWebDriver());
        iuaLoginPage.login("testfort.summer2021@i.ua","testfort202");
        iuaLoginPage.isWrongLoginOrPasswordFieldPresent();
        log("Not logged In with Credentials \"testfort.summer2021@i.ua\" \"testfort202\"");
    }
}
