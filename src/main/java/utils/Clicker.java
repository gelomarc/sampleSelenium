package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertEquals;

public class Clicker {
    final int TIMEOUT = 30;

    Waiter waiter;

    private void click(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        ExpectedCondition<Boolean> elementIsClickable = arg0 ->
        {
            try {
                element.click();
                return true;
            } catch (Exception e) {
                return false;
            }
        };
        wait.until(elementIsClickable);
    }

    public void enterText(WebElement element, WebDriver driver, String text) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        ExpectedCondition<Boolean> elementIsActive = arg0 ->
        {
            try {
                element.sendKeys(text);
                assertEquals(text, element.getText());
                return true;
            } catch (Exception e) {
                return false;
            }
        };
        wait.until(elementIsActive);
    }
}
