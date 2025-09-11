package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestAccount extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void testlogin(){
        homePage.getElement(homePage.Signup_Login_btn).click();
        loginPage.writeOnElement(loginPage.login_email_name_field,"bimoke9741@dpwev.com");
        loginPage.writeOnElement(loginPage.login_pass_field,"12345678");
        loginPage.clickOnElement(loginPage.login_btn);
    }
}
