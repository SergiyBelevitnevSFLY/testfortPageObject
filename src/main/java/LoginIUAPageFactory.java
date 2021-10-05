import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIUAPageFactory {
    private WebDriver webDriver;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement loginInput;

    @FindBy(xpath = "//*[@name='pass']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@value='Войти']")
    public WebElement submit;

    public LoginIUAPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void login(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        submit.click();
    }

}
