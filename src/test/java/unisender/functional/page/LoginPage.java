package unisender.functional.page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import unisender.functional.testconfig.Config;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public void open() {
        Selenide.open(Config.baseUrl + "/login");
    }

    public void login(String login) {
        $(By.cssSelector("input[data-test='input-login']")).val(login);
    }

    public void pass(String pass) {
        $(By.cssSelector("input[data-test='input-password']")).val(pass);
    }

    public void click() {
        $(By.cssSelector("button[data-test='btn-login']")).click();
    }
}
