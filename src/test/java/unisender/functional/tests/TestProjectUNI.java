import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import unisender.functional.page.CPpage;
import unisender.functional.page.LoginPage;
import unisender.functional.page.WelcomePage;


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

        CPpage cpage = new CPpage();
        cpage.menuopen();
        cpage.logout();


    }
}
