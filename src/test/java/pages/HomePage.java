package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String url = "https://www.wafilife.com/";
    public String title = "WafiLife";

    public By search_field = By.xpath("//div[@class='header_search']//input[@id='freeSearchBoxWeb']");
    public By Signup_Login_btn = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    public By search_btn = By.xpath("//div[@class='header_search']//button[@type='submit']");
    public By trending_book_btn = By.xpath("//a[contains(text(),'সকল ট্রেন্ডিং বই')]");
    public By author_one = By.xpath("//div[@class='owl-item active']//p[contains(text(),'শায়খ আহমাদুল্লাহ')]");
    public By author_select = By.xpath("//body/div[@class='body-wrapper']/div[@class='wd-content']/div[@id='template-wrapper']/div[@id='main-module-container']/div[@id='container']/div[@id='content']/div[@id='main']/div[@id='container-main']/div[@class='main-content']/article[@id='post-45']/div[@class='entry-content-post']/div[@class='wafi_products']/div[@class='woocommerce']/div[@class='col-xs-12 cat-carousel owl-carousel owl-theme owl-responsive-768 owl-loaded']/div[@class='owl-stage-outer']/div[@class='owl-stage']/div[1]/div[1]/a[1]/img[1]");
    public By book1 = By.xpath("//a[contains(text(),'রমযান নিয়ে শায়খ আহমাদুল্লাহ`র তিনটি সংকলন একসাথে (')]");
    public By show_all = By.xpath("//a[contains(text(),'পুরো লিস্ট দেখুন')]");


    public void loadHomePage() {
        loadAWebPage(url);
    }
}
