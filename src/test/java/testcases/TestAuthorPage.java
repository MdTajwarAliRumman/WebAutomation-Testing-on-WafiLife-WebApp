package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthorPage;
import pages.HomePage;
import utilities.DriverSetup;

public class TestAuthorPage extends DriverSetup {
    HomePage homePage = new HomePage();
    AuthorPage authorPage = new AuthorPage();
    JavascriptExecutor js = (JavascriptExecutor)getDriver();

    @BeforeMethod
    public void loadAuthorPage() {
        getDriver().get(homePage.url);
        authorPage.navigateToAuthorPage();
    }

    @Test
    public void testIndividualAuthorBooks() throws InterruptedException {
        WebElement author_Name = homePage.getElement(homePage.author_one);
        js.executeScript("arguments[0].scrollIntoView()",author_Name);
        homePage.clickOnElement(homePage.author_select);
        Thread.sleep(2000);
    }
}
