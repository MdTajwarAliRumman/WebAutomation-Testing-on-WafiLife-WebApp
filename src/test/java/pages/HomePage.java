package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String url = "https://www.wafilife.com/";
    public String title = "WafiLife";

    public By search_field = By.xpath("//div[@class='header_search']//input[@id='freeSearchBoxWeb']");
    public By Signup_Login_btn = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    public By search_btn = By.xpath("//div[@class='header_search']//button[@type='submit']");

    public void loadHomePage() {
        loadAWebPage(url);
    }
}
