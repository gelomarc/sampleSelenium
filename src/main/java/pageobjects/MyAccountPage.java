package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//a[@title='Orders']")
    private WebElement ordersHistory;
    @FindBy(xpath = "//a[@title='Credit slips']")
    private WebElement myCreditSlips;
    @FindBy(xpath = "//a[@title='Addresses']")
    private WebElement myAddresses;
    @FindBy(xpath = "//a[@title='Information']")
    private WebElement myPersonalInformation;
    @FindBy(xpath = "//a[@title='My wishlists']")
    private WebElement myWishList;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void openOrders() {
        waiter.click(ordersHistory, driver);
    }

    public void openCreditSlips() {
        waiter.click(myCreditSlips, driver);
    }

    public void openAddresses() {
        waiter.click(myAddresses, driver);
    }

    public void openPersonalInformation() {
        waiter.click(myPersonalInformation, driver);
    }

    public void openWishList() {
        waiter.click(myWishList, driver);
    }
}