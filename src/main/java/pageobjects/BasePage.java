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

    @FindBy(id = "header_logo")
    private WebElement logo;

    @FindBy(xpath = "//div[@id = 'block_top_menu']//a[@title = 'Women']")
    private WebElement womenCategory;

    @FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[2]//a[@title = 'Dresses']")
    private WebElement dressesCategory;

    @FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[3]//a[@title = 'T-shirts']")
    private WebElement tshirtsCategory;

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

    public void clickOnLogo() {
        logo.click();
    }

    public void clickOnWomenCategory() {
        womenCategory.click();
    }

    public void clickOnDressesCategory() {
        dressesCategory.click();
    }

    public void clickOnTShirtsCategory() {
        tshirtsCategory.click();
    }
}
