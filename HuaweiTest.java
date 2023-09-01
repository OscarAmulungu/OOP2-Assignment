package Company;

import static org.junit.Assert.*;
import org.junit.Test;
public class HuaweiTest {

	@Test
    public void testPriceWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Huawei("Huawei D3", -5000.86, "Black", 2022, 6.2);
        });
    }
	@Test
	public void testSellingPrice() {
		Huawei huawei = new Huawei("Huawei D3", 5000.86, "Black",2018, 6.2);
        Double expectedSellingPrice = 5000.86 + 5000.86 * 0.3;
        assertEquals(expectedSellingPrice, huawei.SellingPrice(),0.001);
    }
    @Test
    public void testDiscountPrice() {
    	Huawei huawei = new Huawei("Huawei D3", 5000.86, "Black",2018, 6.2);
        Double expectedDiscountPrice = (5000.86 + 5000.86 * 0.3)- 200;
        assertEquals(expectedDiscountPrice, huawei.DiscountPrice(),0.001);
    }
}
