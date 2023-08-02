package Company;

import static org.junit.Assert.*;

import org.junit.Test;
public class SamsungTest {

	@Test
	public void testSellingPrice() {
		Samsung samsung = new Samsung("Samsung Galaxy S10", 10200.45, "Black", "Samsung",2018, 6.1);
		// Calculate the expected selling price
        Double expectedSellingPrice = 10200.45 + 10200.45 * 0.4;

        // Assert the expected selling price with the actual result
        assertEquals(expectedSellingPrice, samsung.SellingPrice(), 0.001);
    }
    @Test
    public void testDiscountPrice() {
        // Create a Samsung object with specific values
        Samsung samsung = new Samsung("Samsung Galaxy S10", 10200.45, "Black", "Samsung", 2021, 6.1);

        // Calculate the expected discount price
        Double expectedDiscountPrice = (10200.45 + 10200.45 * 0.4) - 1100;

        // Assert the expected discount price with the actual result
        assertEquals(expectedDiscountPrice, samsung.DiscountPrice(), 0.001);
    }
}