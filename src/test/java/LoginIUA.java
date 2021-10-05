import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginIUA extends BaseTest {



    @Test
    public void loginIUA(){
        getWebDriver().get("https://passport.i.ua/login/");
        getWebDriver().findElement(By.xpath("//*[@name='login']")).sendKeys("testfort.summer2021@i.ua");
        getWebDriver().findElement(By.xpath("//*[@name='pass']")).sendKeys("testfort2021");
        getWebDriver().findElement(By.xpath("//*[@value='Войти']")).click();
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='выйти']")));
    }

    @Test
    public void loginIUANegative(){
        getWebDriver().get("https://passport.i.ua/login/");
        getWebDriver().findElement(By.xpath("//*[@name='login']")).sendKeys("testfort.summer2021@i.ua");
        getWebDriver().findElement(By.xpath("//*[@name='pass']")).sendKeys("testfort2021hnf");
        getWebDriver().findElement(By.xpath("//*[@value='Войти']")).click();
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='content clear']")));
    }
}
