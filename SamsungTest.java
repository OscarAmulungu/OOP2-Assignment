package Company;

import static org.junit.Assert.*;
import org.junit.Test;
public class SamsungTest {


    @Test
    public void testPriceWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Samsung("Samsung Galaxy S21", -2555.0, "Black", 2022, 6.2);
        });
    }
	@Test
	public void testSellingPrice() {
		Samsung samsung = new Samsung("Samsung Galaxy S21", 10200.10, "Black",2022, 6.2);
        Double expectedSellingPrice = 10200.10 + 10200.10 * 0.4;
        assertEquals(expectedSellingPrice, samsung.SellingPrice(),0.001);
    }
    @Test
    public void testDiscountPrice() {
    	Samsung samsung = new Samsung("Samsung Galaxy S21", 10200.10, "Black",2022, 6.2);
        Double expectedDiscountPrice = (10200.10 + 10200.10 *0.4) - 1100;
        assertEquals(expectedDiscountPrice, samsung.DiscountPrice(),0.001);
    }
}
