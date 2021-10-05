import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    private WebDriver webDriver;


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        setWebDriver(webDriver);
    }

    @AfterMethod
    public void killDriver(){
        getWebDriver().quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
