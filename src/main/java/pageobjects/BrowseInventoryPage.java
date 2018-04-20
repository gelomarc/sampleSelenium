package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrowseInventoryPage extends BasePage {

    public BrowseInventoryPage(WebDriver driver) {
        super(driver);
    }

    List<WebElement> productsList;

    public String getInventoryItemName(int index) {
        productsList = driver.findElements(By.xpath("//ul[starts-with(@class, 'product_list')]/li"));
        return productsList.get(index).findElement(By.xpath(".//a[@class = 'product-name']")).getText();
    }

    public String getInventoryPrice(int index) {
        System.out.println();
        return productsList.get(index).findElement(By.xpath(".//div[@class= 'right-block']//span[@class = 'price product-price']")).getText().substring(1);
    }
}