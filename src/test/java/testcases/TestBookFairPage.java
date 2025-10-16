package testcases;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BookFairPage;
import pages.HomePage;
import utilities.DriverSetup;

public class TestBookFairPage extends DriverSetup {
    HomePage homePage = new HomePage();
    BookFairPage bookFairPage = new BookFairPage();
    JavascriptExecutor js = (JavascriptExecutor) getDriver();


    @BeforeMethod
    public void loadBookFairTestPage() {
        getDriver().get(homePage.url);
        bookFairPage.navigateToBookFairPage();
    }

    @Test(description = "Testing the bookfair section page")
    @Description("Testing various section of the page including book,placeOrder, viewMore and card and add purchase")
    public void testBookFairPageBooks() throws InterruptedException {
//        WebElement muslimItihash = bookFairPage.getElement(bookFairPage.muslim_itihash);
//        js.executeScript("arguments[0].scrollIntoView()", muslimItihash);
        Actions actions = new Actions(getDriver());
        actions.scrollByAmount(0,800).build().perform();
        Thread.sleep(2000);
        bookFairPage.clickOnElement(bookFairPage.muslim_itihash);
        bookFairPage.clickOnElement(bookFairPage.placeOrder_btn);
        bookFairPage.clickOnElement(bookFairPage.viewMore_btn);
        bookFairPage.clickOnElement(bookFairPage.cart);
        bookFairPage.clickOnElement(bookFairPage.crossIcon);

        Thread.sleep(2000);
    }

}
