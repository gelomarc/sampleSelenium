package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    private final int TIMEOUT = 30;
    WebDriverWait wait;
    private WebDriver driver;

    public Waiter(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToBeVisible(WebElement element) {
        wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(arg0 -> element.isDisplayed());
    }

    public void waitForPageLoad() {
        wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(driver1 -> String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState")).equals("complete"));
    }

    public void openPage(String url) {
        driver.get(url);
        waitForPageLoad();
    }
}
