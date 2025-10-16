package testcases;

import io.qameta.allure.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.AuthorPage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
    HomePage homePage = new HomePage();
    AuthorPage searchPage = new AuthorPage();

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
    @Test(description = "Testing the searchbar")
    @Description("Should be able to maintain the proper flow")
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
