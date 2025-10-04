package pages;

import org.openqa.selenium.By;

public class BookFairPage extends BasePage{

    public By prokashok_section = By.xpath("//li[5]//ul[1]");
    public By radio_btn = By.xpath("//div[@id='product_cat_str:দুআ ও যিকির']");
    public By package_select = By.xpath("//a[contains(text(),'নির্বাচিত দু')]");
    public By order_btn = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    public By muslim_itihash = By.xpath("//img[@alt='মুসলিম জাতির ইতিহাস']");
    public By cart = By.xpath("//a[@title='View your shopping cart']");
    public By placeOrder_btn = By.xpath("//div[@class='body-wrapper']//button[2]");
    public By viewMore_btn  = By.xpath("//a[@class='button buy-more']");
    public By crossIcon = By.xpath("//div[@class='right cart-tab light visible open']//li[1]//a[1]");

    HomePage homePage = new HomePage();

    public void navigateToBookFairPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.show_all);
    }
}
