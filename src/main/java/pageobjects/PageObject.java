package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;

public class PageObject {
    protected WebDriver driver;

    protected Waiter waiter;

    public PageObject(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}