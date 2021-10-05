import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IUALoginPage extends BasePage {


    private final By loginInput = By.xpath("//*[@name='login']");
    private final By passwordInput = By.xpath("//*[@name='pass']");
    private final By submit = By.xpath("//*[@value='Войти']");
    private final By exitButton = By.xpath("//*[@title='выйти']");
    private final By wrongLoginOrPassword = By.xpath("//*[@class='content clear']");

    public IUALoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void sendLogin(String login){
       setKeys(loginInput, login);
    }

    private void sendPassword(String password){
        setKeys(passwordInput, password);
    }

    private void clickEnter(){
        click(submit);
    }

    public void login(String login, String password){
        sendLogin(login);
        sendPassword(password);
        clickEnter();
    }

    public void isExitButtonPresent(){
        isElementPresentWithWait(exitButton, 10);
    }

    public void isWrongLoginOrPasswordFieldPresent(){
        isElementPresentWithWait(wrongLoginOrPassword, 10);
    }
}
