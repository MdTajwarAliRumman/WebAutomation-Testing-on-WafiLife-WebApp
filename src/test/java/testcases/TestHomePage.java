package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import utilities.DriverSetup;

import javax.swing.*;

public class TestHomePage extends DriverSetup {
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

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
    public void testSearchBar() throws InterruptedException {
//        homePage.clickOnElement(homePage.search_field);
        Actions actions = new Actions(getDriver());

        homePage.getElement(homePage.search_field).sendKeys("islam");
        homePage.clickOnElement(homePage.search_btn);
        searchPage.getElement(searchPage.prokashok_section).click();
        actions.scrollByAmount(0,500).build().perform();
        Thread.sleep(3000);

    }
}
