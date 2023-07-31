package Company;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhoneShopTest {

	@Test
	public void test() {
		assertEquals("ABC", "ABC");
		
	}
	@Test
	public void test1() {
		PhoneShop shop = new PhoneShop();
		Double actual = shop.CostOfAllDevices();
		Double expected = 29000.34 ;
		assertEquals(expected, actual);
	}
}
