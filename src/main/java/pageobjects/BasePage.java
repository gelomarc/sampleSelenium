package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends PageObject {

    @FindBy(id = "contact-link")
    private WebElement contactLinkButton;

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(xpath = "//div[@class = 'shopping_cart']/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchButton;

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void clickContactLinkButton() {
        contactLinkButton.click();
    }

    public void enterTextAndSearch(String text) {
        searchBox.sendKeys(text);
        searchButton.click();
    }

    public void openCart() {
        shoppingCart.click();
    }
}
