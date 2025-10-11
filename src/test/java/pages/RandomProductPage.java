package pages;

import org.openqa.selenium.By;

public class RandomProductPage extends BasePage {

    public By addTo_Cart = By.xpath("//span[@class='tinvwl_add_to_wishlist-text']");


    HomePage homePage = new HomePage();

    public void navigateRandomProductsPage() {
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.different_items);
    }
}
