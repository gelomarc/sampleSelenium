import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CheckCategoriesTest extends AbstractTest {

    @Test
    public void checkWomenCategoryTest() {
        browseInventoryPage.clickOnWomenCategory();
        assertEquals("Faded Short Sleeve T-shirts", browseInventoryPage.getInventoryItemName(0));
        assertEquals("16.51", browseInventoryPage.getInventoryPrice(0));
    }

    @Test
    public void checkDressCategoryTest() {
        browseInventoryPage.clickOnDressesCategory();
        assertEquals("Printed Dress", browseInventoryPage.getInventoryItemName(0));
        assertEquals("26.00", browseInventoryPage.getInventoryPrice(0));
    }

    @Test
    public void checkTShirtsCategoryTest() {
        browseInventoryPage.clickOnTShirtsCategory();
        assertEquals("Faded Short Sleeve T-shirts", browseInventoryPage.getInventoryItemName(0));
        assertEquals("16.51", browseInventoryPage.getInventoryPrice(0));
    }
}