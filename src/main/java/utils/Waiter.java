package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertEquals;

public class Waiter {

    private final int TIMEOUT = 30;
    WebDriverWait wait;
    private WebDriver driver;

    public Waiter(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT);
    }

    public void waitForPageLoad() {
        wait.until(driver1 -> String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState")).equals("complete"));
    }

    public void openPage(String url) {
        driver.get(url);
        waitForPageLoad();
    }

    public void enterText(WebElement element, WebDriver driver, String text) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        ExpectedCondition<Boolean> elementIsActive = elementToEnterText ->
        {
            try {
                element.clear();
                element.sendKeys(text);
                assertEquals(text, element.getAttribute("value"));
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        };
        wait.until(elementIsActive);
    }

    public void selectFromDropdownByValue(WebElement element, WebDriver driver, String text) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        Select select = new Select(element);
        ExpectedCondition<Boolean> elementIsActive = elementToSelectFrom ->
        {
            try {
                select.selectByValue(text);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        };
        wait.until(elementIsActive);
    }

    public void selectFromDropdownByText(WebElement element, WebDriver driver, String text) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        Select select = new Select(element);
        ExpectedCondition<Boolean> elementIsActive = elementToSelectFrom ->
        {
            try {
                select.selectByVisibleText(text);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        };
        wait.until(elementIsActive);
    }

    public void click(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        ExpectedCondition<Boolean> elementIsClickable = elementToClickOn ->
        {
            try {
                element.click();
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        };
        wait.until(elementIsClickable);
    }
}
