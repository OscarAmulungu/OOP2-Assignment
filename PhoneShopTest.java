package Company;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PhoneShopTest {

	private PhoneShop phoneshop;
	
	@Before
	public void setUp() {
		phoneshop = new PhoneShop();
		phoneshop.AddNewDevice(new IPhone("IPhone 13", 5000.45, "White", "IPhone", 2017, 5.5));
		phoneshop.AddNewDevice(new IPhone("IPhone 12", 13399.45, "Black", "IPhone", 2020, 6.2));
		phoneshop.AddNewDevice(new IPhone("IPhone 11", 10999.78, "Black", "IPhone", 2019, 6.1));
		phoneshop.AddNewDevice(new Samsung("Samsung Note10", 9000.42, "Gold", "Samsung", 2011, 6.3));
		phoneshop.AddNewDevice(new Samsung("Samsung Galaxy Z", 8600.42, "Green", "Samsung", 2022, 6.8));
		phoneshop.AddNewDevice(new Samsung("Samsung Galaxy S8", 16499.42, "Blue", "Samsung", 2017, 5.9));
		phoneshop.AddNewDevice(new Huawei("Huawei Y5P", 2199.42, "Blue", "Huawei", 2018, 5.8));
		phoneshop.AddNewDevice(new Huawei("Huawei D3", 4700.42, "White", "Huawei", 2022, 5.8));
		
	}
	
	@Test
	public void testCountHowManySamsungDevices() {
		int expectedValue = 3;
		int actualValue = phoneshop.CountHowManySamsungDevices();
		assertEquals((int) expectedValue, actualValue);
	}
	@Test
	public void testCountHowManyAppleDevices() {
		int expectedValue = 3;
		int actualValue = phoneshop.CountHowManyIPhone8Devices();
		assertEquals((int) expectedValue, actualValue);
	}
	@Test
	public void testCountHowManyHuaweiDevices() {
		int expectedValue = 2;
		int actualValue = phoneshop.CountHowManyHuaweiDevices();
		assertEquals((int) expectedValue, actualValue);
	}
	@Test
	public void testTotalPriceForAllDevices() {
		Double expectedTotalPrice = 4700.42+2199.42+16499.42+ 8600.42+9000.42+10999.78+13399.45 +5000.45;
		assertEquals(expectedTotalPrice, phoneshop.TotalPriceofDevices());
	}
	@Test
	public void testAveragePrice() {
		Double expectedAveragePrice = (4700.42+2199.42+16499.42+ 8600.42+9000.42+10999.78+13399.45 +5000.45)/8.0;
		assertEquals(expectedAveragePrice, phoneshop.AveragePrice());
	}
	@Test
	public void testWhiteColorDevices() {
		assertTrue(phoneshop.ContainsSpecificWhiteDevices("White"));
	}
	 @Test
    public void testHuaweiD3Devices() {
        assertTrue(phoneshop.FindIfHuaweiD3WasSold("Huawei D3"));
    }
	
	@Test
	public void testBlackColorDevices() {
		assertTrue(phoneshop.ContainsSpecificBlackDevices("Black"));
	}
	@Test
	public void testNokiaDevices() {
		assertFalse(phoneshop.ContainsSpecificNokiaDevices("Nokia"));
	}
	@Test
	public void testHowMany2018Devices() {
		int expectedValue = 1;
		int actualValue = phoneshop.HowMany2018Devices();
		assertEquals((int) expectedValue, actualValue);
		
	}
	@Test
	public void testNameOfExpensiveDevice() {
		String expectedValue = "Samsung Galaxy S8";
		String actualValue = phoneshop.NameOfMostExpensiveDevice();
		assertEquals(expectedValue, actualValue);
	}
	@Test
	public void testNameOfCheapestDevice() {
		String expectedValue = "Huawei Y5P";
		String actualValue = phoneshop.NameOfCheapestDevice();
		assertEquals(expectedValue, actualValue);
	}
	@Test
	public void testLargestDisplaySize() {
		Double expectedValue = 6.8;
		Double actualValue = phoneshop.LargestDevice();
		assertEquals(expectedValue, actualValue);
	}
	@Test
	public void testSmallestDisplaySize() {
		Double expectedValue = 5.5;
		Double actualValue = phoneshop.SmallestDevice();
		assertEquals(expectedValue, actualValue);
	}

}
