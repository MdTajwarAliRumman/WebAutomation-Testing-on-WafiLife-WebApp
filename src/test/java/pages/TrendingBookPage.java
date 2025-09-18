package pages;

import org.openqa.selenium.By;

public class TrendingBookPage extends BasePage{

    public By trending_book_btn = By.xpath("//a[contains(text(),'সকল ট্রেন্ডিং বই')]");

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
//    public void navigateToAccountPage(){
//        loginPage.clickOnElement(loginPage.login_btn);
//    }

    public void navigateToTrendingPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.Signup_Login_btn);
    }
}
