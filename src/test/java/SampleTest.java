import org.junit.Test;
import pageobjects.HomePage;

import static junit.framework.TestCase.assertTrue;

public class SampleTest extends AbstractTest {


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
