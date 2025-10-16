package pages;

import org.openqa.selenium.By;

public class RandomProductPage extends BasePage {

    public By addTo_Cart = By.xpath("//button[@class='single_add_to_cart_button button alt added']");
    public By homeMenu = By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-219 menu-item-level0 wd-fly-menu']//a");
    public By select_tupi  = By.xpath("//a[contains(text(),'গুজরাটি টুপি (Ash)')]");
    public By next_btn  = By.xpath("//a[@id='product_thumbnails_next']");
    public By view_btn  = By.xpath("//div[@class='owl-item active']//div//a[@title='Photoroom-20251006_102416']//img[@alt='Gujrati Tupi Ash']");
    public By cancel_btn  = By.xpath("//a[normalize-space()='Close']");
    public By size_dropdown  = By.xpath("//select[@id='pa_size']");
    public By nexttoggle_btn  = By.xpath("//a[@id='product_thumbnails_next']");
    public By read_details = By.xpath("//button[contains(text(),'একটু পড়ে দেখুন')]");
    public By cross_details = By.xpath("//i[@class='fa fa-times-circle']");
    public By order_books = By.xpath("//button[@class='single_add_to_cart_button button alt ']");


    HomePage homePage = new HomePage();

    public void navigateRandomProductsPage() {
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.different_items);
    }
}
