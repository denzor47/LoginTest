package unisender.functional.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CPpage {
    public void menuOpen() {
        $(By.cssSelector(".cabinetHeader__content")).shouldBe(Condition.visible);
        $(By.cssSelector(".menuItem__buttonInlineContent .menuItem__buttonSubText")).click();
    }

    public void logout() {
        $(By.cssSelector("#logOutButton")).click();
    }
}
