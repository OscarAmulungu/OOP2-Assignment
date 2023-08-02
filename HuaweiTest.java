package Company;

import static org.junit.Assert.*;

import org.junit.Test;
public class HuaweiTest {

	@Test
	public void testSellingPrice() {
		Huawei huawei = new Huawei("Huawei D3", 4500.86, "Black", "Huawei",2018, 6.2);
		// Calculate the expected selling price
        Double expectedSellingPrice = 4500.86 + 4500.86 * 0.3;

        // Assert the expected selling price with the actual result
        assertEquals(expectedSellingPrice, huawei.SellingPrice(), 0.001);
    }
    @Test
    public void testDiscountPrice() {
        // Create a Samsung object with specific values
    	Huawei huawei = new Huawei("Huawei D3", 4500.86, "Black", "Huawei",2018, 6.2);

        // Calculate the expected discount price
        Double expectedDiscountPrice = (4500.86 + 4500.86 * 0.3) - 200;

        // Assert the expected discount price with the actual result
        assertEquals(expectedDiscountPrice, huawei.DiscountPrice(), 0.001);
    }
}