package unisender.functional.page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CPpage {
    public void menuopen() {
        $(By.cssSelector(".cabinetHeader__content")).shouldBe(Condition.visible);
        $(By.cssSelector(".menuItem__buttonInlineContent .menuItem__buttonSubText")).click();
    }

    public void logout() {
        $(By.cssSelector(".menuItem__menuSubItem")).shouldBe(Condition.visible);
        $(By.cssSelector("button[id='logOutButton']")).click();
    }
}
