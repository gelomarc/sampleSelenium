package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddresses extends BasePage {

    @FindBy(xpath = "//*[@class = 'page-subheading']")
    private WebElement addressAlias;
    @FindBy(xpath = "//*[@class = 'address_name'][1]")
    private WebElement firstName;
    @FindBy(xpath = "//*[@class = 'address_name'][2]")
    private WebElement lastName;
    @FindBy(xpath = "//*[@class = 'address_address1'][1]")
    private WebElement addressLineOne;
    @FindBy(xpath = "//*[@class = 'address_address2'][1]")
    private WebElement addressLineTwo;
    @FindBy(xpath = "//ul[@class = 'last_item item box']/li[5]/span[1]")
    private WebElement city;
    @FindBy(xpath = "//ul[@class = 'last_item item box']/li[5]/span[2]")
    private WebElement state;
    @FindBy(xpath = "//ul[@class = 'last_item item box']/li[5]/span[3]")
    private WebElement postalCode;
    @FindBy(xpath = "//ul[@class = 'last_item item box']/li[6]/span")
    private WebElement country;
    @FindBy(xpath = "//span[@class = 'address_phone']")
    private WebElement homePhone;
    @FindBy(xpath = "//span[@class = 'address_phone_mobile']")
    private WebElement mobilePhone;

    public MyAddresses(WebDriver driver) {
        super(driver);
    }

    public String getAddressAlias() {
        return addressAlias.getText();
    }

    public String getFirstName() {
        return firstName.getText();
    }

    public String getLastName() {
        return lastName.getText();
    }

    public String getAddressLineOne() {
        return addressLineOne.getText();
    }

    public String getAddressLineTwo() {
        return addressLineTwo.getText();
    }

    public String getCity() {
        return city.getText().replace(",", "");
    }

    public String getState() {
        return state.getText();
    }

    public String getPostalCode() {
        return postalCode.getText();
    }

    public String getCountry() {
        return country.getText();
    }

    public String getHomePhone() {
        return homePhone.getText();
    }

    public String getMobilePhone() {
        return mobilePhone.getText();
    }
}