package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;

public abstract class BasePage {

    protected WebDriver driver;

    protected Waiter waiter;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }

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

    @FindBy(xpath = "//a[@class = 'login']")
    private WebElement signIn;

    @FindBy(xpath = "//a[@class = 'View my customer account']")
    private WebElement openAccount;

    @FindBy(xpath = "//*[@title = 'Log me out']")
    private WebElement signOut;

    public void clickContactLinkButton() {
        waiter.click(contactLinkButton, driver);
    }

    public void enterTextAndSearch(String text) {
        waiter.enterText(searchBox, driver, text);
        waiter.click(searchButton, driver);
    }

    public void openCart() {
        waiter.click(shoppingCart, driver);
    }

    public void clickOnLogo() {
        waiter.click(logo, driver);
    }

    public void openWomenCategory() {
        waiter.click(womenCategory, driver);
        waiter.waitForPageLoad();
    }

    public void openDressesCategory() {
        waiter.click(dressesCategory, driver);
        waiter.waitForPageLoad();
    }

    public void openTShirtsCategory() {
        waiter.click(tshirtsCategory, driver);
        waiter.waitForPageLoad();
    }

    public void clickOnSignIn() {
        waiter.click(signIn, driver);
    }

    public void openMyAccount() {
        waiter.click(openAccount, driver);
    }

    public void clickOnSignOut() {
        waiter.click(signOut, driver);
    }
}