package testcases;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthorPage;
import pages.HomePage;
import utilities.DriverSetup;

public class TestAuthorPage extends DriverSetup {
    HomePage homePage = new HomePage();
    AuthorPage authorPage = new AuthorPage();
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    @BeforeMethod
    public void loadAuthorTestPage() {
        getDriver().get(homePage.url);
        authorPage.navigateToAuthorPage();

    }

    @Test(description = "Testing individual Author selection with book purchasing")
    @Description("Authenticated User is trying to purchase books by selecting author and order process ")
    public void testIndividualAuthorBooks() throws InterruptedException {
//        WebElement author_Name = homePage.getElement(homePage.author_one);
//        js.executeScript("arguments[0].scrollIntoView()", author_Name);
        authorPage.clickOnElement(authorPage.radio2_btn);
        Thread.sleep(3000);
        authorPage.clickOnElement(authorPage.Book1);
        Thread.sleep(2000);
        authorPage.clickOnElement(authorPage.order_btn);
        Thread.sleep(2000);
        authorPage.clickOnElement(authorPage.view_more);
        Thread.sleep(2000);
        authorPage.clickOnElement(authorPage.Lekhok_btn);
        Thread.sleep(2000);
        authorPage.writeOnElement(authorPage.searchBar,"শায়খ আহমাদুল্লাহ");
        authorPage.clickOnElement(authorPage.search_btn);
        authorPage.clickOnElement(authorPage.single_Author);
        Thread.sleep(3000);
        authorPage.clickOnElement(authorPage.Book2);
        authorPage.clickOnElement(authorPage.order_btn);
        Thread.sleep(2000);
        authorPage.clickOnElement(authorPage.cartBox);
        authorPage.clickOnElement(authorPage.remove_product);
        authorPage.clickOnElement(authorPage.cartBox);
        Thread.sleep(2000);
        authorPage.clickOnElement(authorPage.checkout_btn);
        Thread.sleep(3000);

    }
}
