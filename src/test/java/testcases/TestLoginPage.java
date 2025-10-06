package testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestLoginPage extends DriverSetup {
    private static final Logger log = LoggerFactory.getLogger(TestLoginPage.class);
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
//    MyAccountPage myAccountPage = new MyAccountPage();

    @BeforeMethod
    public void loadLoginTestPage() {
        getDriver().get(homePage.url);
        loginPage.navigateToLoginPage();
    }

//    @BeforeMethod
//    public void loadLoginAccountPage() {
//        myAccountPage.navigateToAccountPage();
//    }

    @Test
    public void testLoginWithValidCreds() {
        homePage.getElement(homePage.Signup_Login_btn).click();
        loginPage.writeOnElement(loginPage.login_email_name_field, "bimoke9741@dpwev.com");
        loginPage.writeOnElement(loginPage.login_pass_field, "12345678");
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertTrue(loginPage.is_Element_Visible(loginPage.logout_btn));
        Assert.assertFalse(loginPage.is_Element_Visible(loginPage.login_btn));
    }

    @Test(dataProvider = "invalidCredentialsSet", dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String email, String password, String error_msg1) {
        loginPage.writeOnElement(loginPage.login_email_name_field, email);
        loginPage.writeOnElement(loginPage.login_pass_field, password);
        loginPage.clickOnElement(loginPage.login_btn);
//        Assert.assertEquals(loginPage.getElement(loginPage.login_email_name_field).getAttribute("validationMsg"),validation_msg);
        if (loginPage.is_Element_Visible(loginPage.error_msg1))
            Assert.assertEquals(loginPage.getElement(loginPage.error_msg1).getText(), error_msg1);
        Assert.assertTrue(loginPage.is_Element_Visible(loginPage.login_btn));
    }

    @Test
    public void testRegistrationWithValidCredentials(){
        homePage.clickOnElement(homePage.Signup_Login_btn);
        loginPage.writeOnElement(loginPage.name_field,"Tajwar");
        loginPage.writeOnElement(loginPage.phone_field,"01399354145");
        loginPage.writeOnElement(loginPage.email_field,"cijoyet520@kwifa.com");
        loginPage.writeOnElement(loginPage.password_field,"12345678");
        loginPage.writeOnElement(loginPage.confirmPass_field,"12345678");
        loginPage.clickOnElement(loginPage.register_btn);
        Assert.assertTrue(loginPage.is_Element_Visible(loginPage.logout_btn));
        Assert.assertFalse(loginPage.is_Element_Visible(loginPage.register_btn));
    }

    @Test(dataProvider = "invalidRegisterCredentialsSet", dataProviderClass = DataSet.class)
    public void testRegistrationWithInvalidCredentials(String name, String phone, String email, String pass, String confirm_pass, String error_msg,String logout_txt ){
        loginPage.writeOnElement(loginPage.name_field, name);
        loginPage.writeOnElement(loginPage.phone_field, phone);
        loginPage.writeOnElement(loginPage.email_field, email);
        loginPage.writeOnElement(loginPage.password_field,pass);
        loginPage.writeOnElement(loginPage.confirmPass_field,confirm_pass);
        loginPage.clickOnElement(loginPage.register_btn);
        if (loginPage.is_Element_Visible(loginPage.error_msg1))
            Assert.assertEquals(loginPage.getElement(loginPage.error_password).getText(), error_msg);
        Assert.assertTrue(loginPage.is_Element_Visible(loginPage.register_btn));

    }
}
