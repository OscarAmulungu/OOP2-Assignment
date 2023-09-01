package Company;

import static org.junit.Assert.*;
import org.junit.Test;
public class IPhoneTest {

	@Test
    public void testPriceWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new IPhone("IPhone 11", -9000.32, "Black", 2022, 6.2);
        });
    }
	@Test
	public void testSellingPrice() {
		IPhone iphone = new IPhone("IPhone 11", 9000.86, "Black",2018, 6.2);
        Double expectedSellingPrice = 9000.86 + 9000.86 * 0.5;
        assertEquals(expectedSellingPrice, iphone.SellingPrice(), 0.001);
    }
    @Test
    public void testDiscountPrice() {
    	IPhone iphone = new IPhone("IPhone 11", 9000.86, "Black",2018, 6.2);
        Double expectedDiscountPrice = (9000.86 + 9000.86 * 0.5) - 800;
        assertEquals(expectedDiscountPrice, iphone.DiscountPrice(),0.001);
    }
}
