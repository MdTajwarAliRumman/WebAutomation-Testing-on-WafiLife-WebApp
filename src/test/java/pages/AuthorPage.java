package pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage{

    public By prokashok_section = By.xpath("//li[5]//ul[1]");
    public By Lekhok_btn = By.xpath("//span[@class='menu-label-level-0'][contains(text(),'লেখক')]");
    public By radio2_btn = By.xpath("//div[@id='product_cat_str:আস-সুন্নাহ ফাউন্ডেশন পাবলিকেশন্স']");
    public By order_btn = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    public By Book1 = By.xpath("//a[contains(text(),'রমযান নিয়ে শায়খ আহমাদুল্লাহ`র তিনটি সংকলন একসাথে (')]");
    public By Book2 = By.xpath("//a[contains(text(),'Morning and Evening Du')]");
    public By view_more = By.xpath("//a[@class='button buy-more']");
    public By searchBar = By.xpath("//input[@id='cat_search']");
    public By search_btn = By.xpath("//button[@class='btn btn-default']");
    public By single_Author = By.xpath("//h3[contains(text(),'শায়খ আহমাদুল্লাহ')]");
    public By cartBox = By.xpath("//a[@title='View your shopping cart']");
    public By remove_product = By.xpath("//div[@class='right cart-tab light visible open']//li[1]//a[1]");
    public By checkout_btn = By.xpath("//a[@class='button checkout wc-forward']");

    HomePage homePage = new HomePage();

    public void navigateToAuthorPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.author_one);
    }
}
