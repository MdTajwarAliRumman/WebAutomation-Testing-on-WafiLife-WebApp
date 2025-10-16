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

    public By food_items = By.xpath("//h3[normalize-space()='Food']");
    public By food1 = By.xpath("//div[contains(@class,'owl-item active')]//a[contains(text(),'Sabuj Udyog – Sundarban Natural Honey (সুন্দরবনের ')]");
    public By different_items = By.xpath("//h3[contains(text(),'অন্যান্য পণ্য')]");
    public By islamic_items = By.xpath("//h3[contains(text(),'ইসলামি পণ্য')]");
    public By tupi_items = By.xpath("//body//div[@class='body-wrapper']//div[@class='wafi_products']//div[@class='wafi_products']//div[@class='row']//div[9]//div[1]//a[1]");
    public By sahabi_book = By.xpath("//h3[contains(text(),'সাহাবীদের জীবনী')]");
    public By book2_Select = By.xpath("//div[@class='owl-item active']//a[contains(text(),'মুহাজির সাহাবিদের জীবনকথা ১ম ও ২য় খন্ড')]");
    public By footer_title = By.xpath("//div[@class='textwidget custom-html-widget']//img[@title='WafiLife']");

    public By blog = By.xpath("//a[contains(text(),'ব্লগ')]");
    public By contact  = By.xpath("//a[contains(text(),'যোগাযোগ করুন')]");
    public By conditions_link  = By.xpath("//a[contains(text(),'শর্তাবলী')]");
    public By social_link = By.xpath("//i[@class='fa fa-facebook']");
    public By package_btn  = By.xpath("//a[@href='/cat/home-product/প্যাকেজ/']");
    public void loadHomePage() {
        loadAWebPage(url);
    }
}
