package loginPackage;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginIUA extends BaseTest {



    @Test(groups = "Positive")
    public void loginIUA(){
        getWebDriver().get("https://passport.i.ua/login/");
        getWebDriver().findElement(By.xpath("//*[@name='login']")).sendKeys("testfort.summer2021@i.ua");
        getWebDriver().findElement(By.xpath("//*[@name='pass']")).sendKeys("testfort2021");
        getWebDriver().findElement(By.xpath("//*[@value='Войти']")).click();
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='выйти']")));
    }

    @Test(groups = "Negative")
    public void loginIUANegative(){
        getWebDriver().get("https://passport.i.ua/login/");
        getWebDriver().findElement(By.xpath("//*[@name='login']")).sendKeys("testfort.summer2021@i.ua");
        getWebDriver().findElement(By.xpath("//*[@name='pass']")).sendKeys("testfort2021hnf");
        getWebDriver().findElement(By.xpath("//*[@value='Войти']")).click();
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='content clear']")));
    }

    @Test
    public void selenideTest(){

        open("https://testautomationu.applitools.com/");

    }
}
