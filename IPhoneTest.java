package Company;

import static org.junit.Assert.*;

import org.junit.Test;
public class IPhoneTest {

	@Test
	public void testSellingPrice() {
		IPhone iphone = new IPhone("IPhone 11", 9000.86, "Black", "IPhone",2018, 6.2);
		// Calculate the expected selling price
        Double expectedSellingPrice = 9000.86 + 9000.86 * 0.5;

        // Assert the expected selling price with the actual result
        assertEquals(expectedSellingPrice, iphone.SellingPrice(), 0.001);
    }
    @Test
    public void testDiscountPrice() {
        // Create a Samsung object with specific values
    	IPhone iphone = new IPhone("IPhone 11", 9000.86, "Black", "IPhone",2018, 6.2);

        // Calculate the expected discount price
        Double expectedDiscountPrice = (9000.86 + 9000.86 * 0.5) - 800;

        // Assert the expected discount price with the actual result
        assertEquals(expectedDiscountPrice, iphone.DiscountPrice(), 0.001);
    }
}
