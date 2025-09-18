package testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TrendingBookPage;
import utilities.DriverSetup;

public class TestTrendingBookPage extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    TrendingBookPage trendingBookPage = new TrendingBookPage();
    Actions actions = new Actions(getDriver());

    @Test
    public void testTrendingBookSection(){
       actions.scrollByAmount(0,500).build().perform();
    }
}
