package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElement emailAddress;

    public void enterEmail(String email) {
        waiter.enterText(emailAddress, driver, email);
    }
}