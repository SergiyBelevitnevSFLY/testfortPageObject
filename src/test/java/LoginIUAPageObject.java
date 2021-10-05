import org.testng.annotations.Test;

public class LoginIUAPageObject extends BaseTest{

    @Test
    public void iuaLoginPageObject(){

        getWebDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getWebDriver());
        iuaLoginPage.login("testfort.summer2021@i.ua","testfort2021");
        iuaLoginPage.isExitButtonPresent();

    }

    @Test
    public void iuaLoginPageObjectNegative(){

        getWebDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getWebDriver());
        iuaLoginPage.login("testfort.summer2021@i.ua","testfort202");
        iuaLoginPage.isWrongLoginOrPasswordFieldPresent();

    }
}
