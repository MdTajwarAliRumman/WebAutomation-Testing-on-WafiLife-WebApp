package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public By Signup_Login_btn = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    public By name_field = By.xpath("//input[@id='reg_billing_first_name']");
    public By email_field = By.xpath("//input[@id='reg_email']");
    public By phone_field = By.xpath("//input[@id='reg_billing_phone']");
    public By password_field = By.xpath("//input[@id='reg_password']");
    public By confirmPass_field = By.xpath("//input[@id='reg_confirm_password']");
    public By register_btn = By.xpath("//input[@name='register']");
    public By error_blank = By.xpath("//li[contains(text(),'অনুগ্রহ করে সঠিক ইমেইল প্রদান করুন')]");
    public By error_password = By.xpath("//li[contains(text(),'অনুগ্রহ করে আপনার পাসওয়ার্ড প্রদান করুন')]");
    public By error_name = By.xpath("//li[contains(text(),'নাম প্রয়োজন!')]");
    public By error_msg5 = By.xpath("//ul[@class='woocommerce-error']//li");
    public By error_blankPhn = By.xpath("//div[@id='main-module-container']//li[1]");
    public By logout_txt = By.xpath("//a[contains(text(),'লগ অউট করুন')]");



    public By login_email_name_field = By.xpath("//input[@id='username']");
    public By login_pass_field = By.xpath("//input[@id='password']");
    public By login_btn = By.xpath("//input[@name='login']");
    public By user_account_title = By.xpath("//h1[contains(text(),'আমার অ্যাকাউন্ট')]");
    public By logout_btn = By.xpath("//a[contains(text(),'লগ অউট করুন')]");
    public By error_msg1 = By.xpath("//li[contains(text(),'ইউজার নাম প্রয়োজন')]");
    public By error_msg2 = By.xpath("//ul[@class='woocommerce-error']");
    public By error_msg3 = By.xpath("//li[contains(text(),'Unknown email address. Check again or try your use')]");
    public By error_msg4 = By.xpath("//li[contains(text(),'The password you entered for the email address')]");

    // test email bimoke9741@dpwev.com

    HomePage homePage = new HomePage();
    public void navigateToLoginPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.Signup_Login_btn);
    }
}
