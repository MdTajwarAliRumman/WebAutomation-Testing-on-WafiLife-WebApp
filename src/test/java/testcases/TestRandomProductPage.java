package testcases;
import org.openqa.selenium.WebElement;

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

    @BeforeMethod
    public void loadRandomTestPages() {
        getDriver().get(homePage.url);
        randomProductPage.navigateRandomProductsPage();

    }

    @Test(description = "Testing random page option.")
    @Description("Testing random page option by going through different options and dataflow")
    public void testRandomItemPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        homePage.clickOnElement(homePage.food1);
        randomProductPage.clickOnElement(randomProductPage.homeMenu);
        Thread.sleep(1000);
        WebElement islamicItems = homePage.getElement(homePage.islamic_items);
        js.executeScript("arguments[0].scrollIntoView()", islamicItems);
        Thread.sleep(2000);
        homePage.clickOnElement(homePage.tupi_items);
        randomProductPage.clickOnElement(randomProductPage.select_tupi);
        Thread.sleep(2000);
        randomProductPage.clickOnElement(randomProductPage.nexttoggle_btn);
        randomProductPage.clickOnElement(randomProductPage.nexttoggle_btn);
        randomProductPage.clickOnElement(randomProductPage.view_btn);
        randomProductPage.clickOnElement(randomProductPage.cancel_btn);
        randomProductPage.clickOnElement(randomProductPage.size_dropdown);
        randomProductPage.clickOnElement(randomProductPage.homeMenu);
    }

    @Test(description = "Testing Random books selection")
    @Description("Authenticated User is trying to purchase books by selecting random books")
    public void testTheSahabiBookPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebElement sahabiBooks = homePage.getElement(homePage.sahabi_book);
        js.executeScript("arguments[0].scrollIntoView()", sahabiBooks);
        Thread.sleep(2000);
        homePage.clickOnElement(homePage.book2_Select);
        Thread.sleep(2000);
        randomProductPage.clickOnElement(randomProductPage.read_details);
        randomProductPage.clickOnElement(randomProductPage.cross_details);
        randomProductPage.clickOnElement(randomProductPage.order_books);

    }
}
