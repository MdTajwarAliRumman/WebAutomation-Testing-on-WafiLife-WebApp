package testcases;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthorPage;
import pages.HomePage;
import pages.RandomProductPage;
import utilities.DriverSetup;

public class TestRandomProductPage extends DriverSetup {
    HomePage homePage = new HomePage();
    RandomProductPage randomProductPage = new RandomProductPage();
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    @BeforeMethod
    public void loadRandomTestPages() {
        getDriver().get(homePage.url);
        randomProductPage.navigateRandomProductsPage();

    }

    @Test(description = "Testing individual Author selection with book purchasing")
    @Description("Authenticated User is trying to purchase books by selecting author and order process ")
    public void testIndividualAuthorBooks() throws InterruptedException {
//        WebElement author_Name = homePage.getElement(homePage.author_one);
//        js.executeScript("arguments[0].scrollIntoView()", author_Name);
        homePage.clickOnElement(homePage.food1);
        randomProductPage.clickOnElement(randomProductPage.addTo_Cart);
        Thread.sleep(3000);


    }
}
