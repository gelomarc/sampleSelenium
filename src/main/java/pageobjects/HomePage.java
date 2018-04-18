package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver webDriver;

    @FindBy(id = "contact-link")
    private WebElement contactLinkButton;

    public WebElement getContactLinkButton() {
        return contactLinkButton;
    }

    public void setContactLinkButton(WebElement contactLinkButton) {
        this.contactLinkButton = contactLinkButton;
    }
}
