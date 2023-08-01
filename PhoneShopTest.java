package Company;

import static org.junit.Assert.*;

import org.junit.Test;


public class PhoneShopTest {

	PhoneShop shop = new PhoneShop();
/*	
	@Test
	public void test() {
		assertEquals("ABC", "ABC");	
	}
*/	
	@Test
	public void testTotalPriceForAllDevices() {
		Double actual = shop.TotalPriceofDevices();
		Double expected = 29000.34 ;
		assertEquals(expected, actual);
	}
	@Test
	public void testWhiteColorDevices() {
		Boolean actualValue = shop.ContainsSpecificWhiteDevices("Green");
		Boolean expectedValue = false;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testNotBlackColorDevices() {
		assertFalse(shop.ContainsSpecificBlackDevices("Gold"));
	}
	@Test
	public void testHowMany2018Devices() {
		int actual = shop.HowMany2018Devices();
		int expected = 2;
		assertEquals(expected,actual);
	}
	@Test
	public void testCountHowManySamsungDevices() {
		int actual = shop.CountHowManySamsungDevices();
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNameOfExpensiveDevice() {
		String actual = shop.NameOfMostExpensiveDevice();
		String expected = "Samsung" ;
		assertEquals(expected, actual);
	}
	@Test
	public void testNameOfCheapestDevice() {
		String actual = shop.NameOfCheapestDevice();
		String expected = "Huawei";
		assertEquals(expected, actual);
	}
	@Test
	public void testAveragePrice() {
		Double actual = shop.AveragePrice();
		Double expected = 29000.34 ;
		assertEquals(expected, actual);
	}
	@Test
	public void testLargestDisplaySize() {
		Double actual = shop.LargestDevice();
		Double expected = 5.5;
		assertEquals(expected, actual);
	}
	@Test
	public void testSmallestDisplaySize() {
		Double actual = shop.SmallestDevice();
		Double expected = 5.5;
		assertEquals(expected, actual);
	}

}
