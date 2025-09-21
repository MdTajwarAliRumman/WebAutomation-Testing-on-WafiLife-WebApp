package testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TrendingBookPage;
import utilities.DriverSetup;

public class  TestTrendingBookPage extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    TrendingBookPage trendingBookPage = new TrendingBookPage();


    @BeforeMethod
    public void loadTrendingBookPage(){
        getDriver().get(homePage.url);
        trendingBookPage.navigateToTrendingPage();
    }

    @Test
    public void testTrendingBookSection() throws InterruptedException {
        Actions actions = new Actions(getDriver());

        trendingBookPage.clickOnElement(trendingBookPage.prokashok_btn);
        Thread.sleep(3000);

        trendingBookPage.clickOnElement(trendingBookPage.bishoy_btn);
        actions.scrollByAmount(0,300).build().perform();

        trendingBookPage.clickOnElement(trendingBookPage.radio_btn);
        Thread.sleep(2000);
        Assert.assertEquals(trendingBookPage.getElement(trendingBookPage.takasur_book).getText(),"সবার জন্য পাইথন");
        Thread.sleep(2000);
        trendingBookPage.clickOnElement(trendingBookPage.python_book);
        Thread.sleep(2000);
        trendingBookPage.clickOnElement(trendingBookPage.read_book);
        Thread.sleep(2000);
        trendingBookPage.clickOnElement(trendingBookPage.cross_window);
        trendingBookPage.clickOnElement(trendingBookPage.purchase_btn);
        Thread.sleep(2000);

    }
}
