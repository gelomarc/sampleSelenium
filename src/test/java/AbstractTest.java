import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.*;
import utils.Waiter;


public abstract class AbstractTest {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);
    BrowseInventoryPage browseInventoryPage = new BrowseInventoryPage(driver);
    Waiter waiter = new Waiter(driver);
    SignInPage signInPage = new SignInPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);
    MyPersonalDetails myPersonalDetails = new MyPersonalDetails(driver);
    MyAddresses myAddresses = new MyAddresses(driver);

    @Before
    public void openPage() {
        waiter.openPage("http://automationpractice.com/index.php");
    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}