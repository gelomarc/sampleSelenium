package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElement createAccountEmailAddress;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    @FindBy(id = "email")
    private WebElement signInEmail;

    @FindBy(id = "passwd")
    private WebElement signInPassword;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public void openSignUpForm(String email) {
        waiter.enterText(createAccountEmailAddress, driver, email);
        waiter.click(createAccountButton, driver);
    }

    public void signIn(String email, String password) {
        waiter.enterText(signInEmail, driver, email);
        waiter.enterText(signInPassword, driver, password);
        waiter.click(signInButton, driver);
    }
}