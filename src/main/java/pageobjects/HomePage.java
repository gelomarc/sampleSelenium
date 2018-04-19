package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(id = "contact-link")
    private WebElement contactLinkButton;

    public HomePage(WebDriver driver)
    {
        super(driver);

    }

    public void clickContactLinkButton() {
        contactLinkButton.click();
    }
}
