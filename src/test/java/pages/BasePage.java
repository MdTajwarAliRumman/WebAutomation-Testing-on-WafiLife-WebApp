package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.ByteArrayInputStream;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    //eta ekta method ja findElement kore and by locator er maddhome
    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

    // locator jeta likha lagto id,text etc etar maddhome ar lekha lagbnena get element korlei pabo
    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public String getPageUrl(){
        return getDriver().getCurrentUrl();
    }

    public String getPageTitle(){
        return getDriver().getTitle();
    }

    public void loadAWebPage(String url){
        getDriver().get(url);
    }

    public void getElementTxt(By locator){
        getElement(locator).getText();
    }
    public boolean is_Element_Visible(By locator){
        try {
            return getElement(locator).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
    public void addScreenshot(){
        // Selenium er ekta package
        Allure.addAttachment("After Test:", new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
