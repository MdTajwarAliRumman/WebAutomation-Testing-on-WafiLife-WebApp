package pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage{

    public By prokashok_section = By.xpath("//li[5]//ul[1]");
    public By radio_btn = By.xpath("//div[@id='product_cat_str:দুআ ও যিকির']");
    public By package_select = By.xpath("//a[contains(text(),'নির্বাচিত দু')]");
    public By order_btn = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    public By Book1 = By.xpath("//img[contains(@title,'রমযান-নিয়ে-শায়খ-আহমাদুল্লাহ`র-তিনটি-সংকলন-একসাথে-(প্যাকেজ)')]");

    HomePage homePage = new HomePage();

    public void navigateToAuthorPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.author_one);
    }
}
