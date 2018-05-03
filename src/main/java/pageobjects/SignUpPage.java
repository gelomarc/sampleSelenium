package pageobjects;

import entities.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends BasePage {

    @FindBy(id = "id_gender1")
    private WebElement maleGenderTitleButton;
    @FindBy(id = "id_gender2")
    private WebElement femaleGenderTitleButton;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameUser;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameUser;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "days")
    private WebElement dateOfBirthDay;
    @FindBy(id = "months")
    private WebElement dateOfBirthMonth;
    @FindBy(id = "years")
    private WebElement dateOfBirthYear;
    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;
    @FindBy(id = "optin")
    private WebElement specialOffersCheckbox;
    @FindBy(id = "firstname")
    private WebElement firstNameAddress;
    @FindBy(id = "lastname")
    private WebElement lastNameAddress;
    @FindBy(id = "company")
    private WebElement company;
    @FindBy(id = "address1")
    private WebElement addressLineOne;
    @FindBy(id = "address2")
    private WebElement addressLineTwo;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "id_state")
    private WebElement state;
    @FindBy(id = "postcode")
    private WebElement postalCode;
    @FindBy(id = "id_country")
    private WebElement country;
    @FindBy(id = "other")
    private WebElement additionalInfo;
    @FindBy(id = "phone")
    private WebElement homePhone;
    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;
    @FindBy(id = "alias")
    private WebElement addressAlias;
    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void fillInSignUpForm(User user) {
        if (user.getTitle().equals("Mr."))
            waiter.click(maleGenderTitleButton, driver);
        else
            waiter.click(femaleGenderTitleButton, driver);
        waiter.enterText(firstNameUser, driver, user.getFirstName());
        waiter.enterText(lastNameUser, driver, user.getLastName());
        waiter.enterText(password, driver, user.getPassword());
        waiter.selectFromDropdownByValue(dateOfBirthDay, driver, String.valueOf(user.getBirthDate().getDayOfMonth()));
        waiter.selectFromDropdownByValue(dateOfBirthMonth, driver, String.valueOf(user.getBirthDate().getMonthValue()));
        waiter.selectFromDropdownByValue(dateOfBirthYear, driver, String.valueOf(user.getBirthDate().getYear()));
        waiter.enterText(company, driver, user.getAddress().getCompany());
        waiter.enterText(addressLineOne, driver, user.getAddress().getAddressLineOne());
        waiter.enterText(addressLineTwo, driver, user.getAddress().getAddressLineTwo());
        waiter.enterText(city, driver, user.getAddress().getCity());
        waiter.selectFromDropdownByText(state, driver, user.getAddress().getState());
        waiter.enterText(postalCode, driver, user.getAddress().getPostalCode());
        waiter.selectFromDropdownByText(country, driver, user.getAddress().getCountry());
        waiter.enterText(additionalInfo, driver, user.getAddress().getAdditionalInfo());
        waiter.enterText(homePhone, driver, user.getAddress().getHomePhone());
        waiter.enterText(mobilePhone, driver, user.getAddress().getMobilePhone());
        waiter.enterText(addressAlias, driver, user.getAddress().getAddressAlias());
        waiter.click(registerButton, driver);
    }
}
