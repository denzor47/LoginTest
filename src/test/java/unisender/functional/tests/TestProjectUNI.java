import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import unisender.functional.pages.CPpage;
import unisender.functional.pages.LoginPage;
import unisender.functional.pages.WelcomePage;


public class TestProjectUNI {
    @Test
    public void userCanLoginByUsername() {
        Configuration.timeout = 10000;

        LoginPage loginpage = new LoginPage();
        loginpage.open();
        loginpage.login("");
        loginpage.pass("");
        loginpage.click();

        WelcomePage welcomepage = new WelcomePage();
        welcomepage.skip();

        CPpage cppage = new CPpage();
        cppage.menuOpen();
        cppage.logout();
    }
}
