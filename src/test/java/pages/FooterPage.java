package pages;

import org.openqa.selenium.By;

public class FooterPage extends BasePage {

    public By blog = By.xpath("//a[contains(text(),'ব্লগ')]");
    public By contact  = By.xpath("//a[contains(text(),'যোগাযোগ করুন')]");
    public By conditions_link  = By.xpath("//a[contains(text(),'শর্তাবলী')]");
    public By social_link = By.xpath("//i[@class='fa fa-facebook']");
    public By package_btn  = By.xpath("//a[@href='/cat/home-product/প্যাকেজ/']");

    HomePage homePage = new HomePage();

    public void navigateFooterLinks() {
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.footer_title);
    }
}
