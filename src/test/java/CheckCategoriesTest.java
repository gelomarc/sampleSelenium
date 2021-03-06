import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CheckCategoriesTest extends AbstractTest {

    @Test
    public void checkWomenCategoryTest() {
        browseInventoryPage.openWomenCategory();
        assertEquals("Faded Short Sleeve T-shirts", browseInventoryPage.getInventoryItemName(0));
        assertEquals("16.51", browseInventoryPage.getInventoryPrice(0));
    }

    @Test
    public void checkDressCategoryTest() {
        browseInventoryPage.openDressesCategory();
        assertEquals("Printed Dress", browseInventoryPage.getInventoryItemName(0));
        assertEquals("26.00", browseInventoryPage.getInventoryPrice(0));
    }

    @Test
    public void checkTShirtsCategoryTest() {
        browseInventoryPage.openTShirtsCategory();
        assertEquals("Faded Short Sleeve T-shirts", browseInventoryPage.getInventoryItemName(0));
        assertEquals("16.51", browseInventoryPage.getInventoryPrice(0));
    }
}