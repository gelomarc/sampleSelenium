import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;

import static junit.framework.TestCase.assertTrue;

public class SampleTest {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);

    @Test
    public void sampleTest()
    {
        driver.get("http://automationpractice.com/index.php");
        homePage.clickContactLinkButton();
        assertTrue( true );
        driver.close();
    }
}
