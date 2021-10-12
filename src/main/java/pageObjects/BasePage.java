package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setKeys(By locator, String input) {
        webDriver.findElement(locator).sendKeys(input);
    }

    public void click(By locator) {
        webDriver.findElement(locator).click();
    }

    public void isElementPresentWithWait(By locator, int timeWait){
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeWait);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
