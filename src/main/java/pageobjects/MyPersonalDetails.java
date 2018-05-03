package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyPersonalDetails extends BasePage {

    @FindBy(xpath = "//*[@id='uniform-id_gender1']/span")
    private WebElement maleGenderTitleButton;
    @FindBy(xpath = "//*[@id='uniform-id_gender2']/span")
    private WebElement femaleGenderTitleButton;
    @FindBy(id = "firstname")
    private WebElement firstNameUser;
    @FindBy(id = "lastname")
    private WebElement lastNameUser;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(xpath = "//*[@id='uniform-days']/span")
    private WebElement dateOfBirthDay;
    @FindBy(xpath = "//*[@id='uniform-months']/span")
    private WebElement dateOfBirthMonth;
    @FindBy(xpath = "//*[@id='uniform-years']/span")
    private WebElement dateOfBirthYear;

    public MyPersonalDetails(WebDriver driver) {
        super(driver);
    }

    public String checkWhichTittleIsChecked() {
        if (maleGenderTitleButton.getAttribute("class").equals("checked"))
            return "Mr.";
        else
            return "Mrs.";
    }

    public String getFirstNameUser() {
        return firstNameUser.getAttribute("value");
    }

    public String getLastNameUser() {
        return lastNameUser.getAttribute("value");
    }

    public String getEmail() {
        return email.getAttribute("value");
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay.getText().replaceAll(" ", "");
    }

    public String getDateOfBirthMonth() {
        return dateOfBirthMonth.getText().replaceAll(" ", "");
    }

    public String getDateOfBirthYear() {
        return dateOfBirthYear.getText().replaceAll(" ", "");
    }
}