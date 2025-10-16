package testcases;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterPage;
import pages.HomePage;
import pages.LoginPage;
import pages.TrendingBookPage;
import utilities.DriverSetup;

public class TestFooterSection extends DriverSetup {
    FooterPage footerPage = new FooterPage();
    HomePage homePage = new HomePage();
    TrendingBookPage trendingBookPage = new TrendingBookPage();


    @BeforeMethod
    public void loadTrendingBookPage(){
        getDriver().get(homePage.url);
        footerPage.navigateFooterLinks();
    }

    @Test(description = "Testing The footer section")
    @Description("Testing The footer section different links ")
    public void testFooterBlogLink() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        WebElement footerSection = homePage.getElement(homePage.footer_title);
        js.executeScript("arguments[0].scrollIntoView()", footerSection);
        Thread.sleep(2000);
        homePage.clickOnElement(homePage.blog);
        Thread.sleep(2000);
    }

    @Test(description = "Testing The footer section")
    @Description("Testing The footer section different links ")
    public void testFooterSocialLink() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        WebElement footerSection = homePage.getElement(homePage.footer_title);
        js.executeScript("arguments[0].scrollIntoView()", footerSection);
        Thread.sleep(2000);
        homePage.clickOnElement(homePage.social_link);
        Thread.sleep(2000);
    }
    @Test(description = "Testing The footer section")
    @Description("Testing The footer section different links ")
    public void testFooterSectionContact() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        WebElement footerSection = homePage.getElement(homePage.footer_title);
        js.executeScript("arguments[0].scrollIntoView()", footerSection);
        Thread.sleep(2000);
        homePage.clickOnElement(homePage.contact);
        Thread.sleep(2000);
    }
    @Test(description = "Testing The footer section")
    @Description("Testing The footer section different links ")
    public void testFooterPackageLink() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        WebElement footerSection = homePage.getElement(homePage.footer_title);
        js.executeScript("arguments[0].scrollIntoView()", footerSection);
        Thread.sleep(2000);
        homePage.clickOnElement(homePage.contact);
        Thread.sleep(2000);
    }
}
