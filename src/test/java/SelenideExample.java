import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideExample {

    @Test
    public void selenideTest(){

        Configuration.browser = "firefox";
        open("https://www.google.com/");
        $(By.xpath("//*[@name='q']")).sendKeys("testfort");

        $("ga").shouldNotHave(text("SWW"));
        $$("gd").shouldHave(texts("First","Second","Third"));
    }
}
