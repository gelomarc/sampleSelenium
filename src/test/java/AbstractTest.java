import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.BrowseInventoryPage;
import pageobjects.HomePage;


public abstract class AbstractTest {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);
    BrowseInventoryPage browseInventoryPage = new BrowseInventoryPage(driver);

    @Before
    public void openPage() {
        driver.get("http://automationpractice.com/index.php");
    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}