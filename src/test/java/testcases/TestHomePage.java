package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void loadHomeTestPage() {
        getDriver().get(homePage.url);
    }

    @Test
    public void checkHomePageUrl() {
        Assert.assertEquals(homePage.getPageUrl(), homePage.url);
    }
//    @Test
//    public void checkHomePageTitle(){
//        getDriver().get(homePage.title);
//        Assert.assertEquals(homePage.getPageTitle(), homePage.title);
//    }
    @Test
    public void testSearchBar(){
//        homePage.clickOnElement(homePage.search_field);
        homePage.getElement(homePage.search_field).sendKeys("islam");

    }
}
