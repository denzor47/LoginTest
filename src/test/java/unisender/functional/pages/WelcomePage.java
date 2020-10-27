package unisender.functional.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WelcomePage {
    public void skip() {
        $(By.cssSelector(".welcomeForm")).shouldBe(Condition.visible);
        $(By.cssSelector(".USButton__label.USButton__label_underline")).click();
    }
}

