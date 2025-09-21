package pages;

import org.openqa.selenium.By;

public class TrendingBookPage extends BasePage {

    public By prokashok_btn = By.xpath("//a[@class='facet-label'][contains(text(),'প্রকাশক')]");
    public By bishoy_btn = By.xpath("//a[contains(text(),'বিষয় সমূহ')]");
    public By radio_btn = By.xpath("//div[@id='product_cat_str:আকছাদুর রহমান']");
    public By takasur_book = By.xpath("//a[contains(text(),'সবার জন্য পাইথন')]");
    public By python_book = By.xpath("//img[@title='সবার-জন্য-পাইথন']");
    public By read_book = By.xpath("//button[contains(text(),'একটু পড়ে দেখুন')]");
    public By cross_window = By.xpath("//i[@class='fa fa-times-circle']");
    public By purchase_btn = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    public void navigateToTrendingPage() {
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.trending_book_btn);
    }
}
