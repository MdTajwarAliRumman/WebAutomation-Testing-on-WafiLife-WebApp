package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{

    public By user_account_title = By.xpath("//h1[contains(text(),'আমার অ্যাকাউন্ট')]");

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
//    public void navigateToAccountPage(){
//        loginPage.clickOnElement(loginPage.login_btn);
//    }


}
