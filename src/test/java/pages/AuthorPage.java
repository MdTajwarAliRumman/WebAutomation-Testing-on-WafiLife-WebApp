package pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage{

    public By prokashok_section = By.xpath("//li[5]//ul[1]");
    public By radio_btn = By.xpath("//div[@id='product_cat_str:দুআ ও যিকির']");
    public By package_select = By.xpath("//a[contains(text(),'নির্বাচিত দু')]");
    public By order_btn = By.xpath("//button[@class='single_add_to_cart_button button alt ']");

    HomePage homePage = new HomePage();

    public void navigateToAuthorPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.author_one);
    }
}
