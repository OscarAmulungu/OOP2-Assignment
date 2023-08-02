package Company;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PhoneShopTest {

	private PhoneShop phoneshop;
	
	@Before
	public void setUp() {
		phoneshop = new PhoneShop();
		phoneshop.AddNewDevice(new IPhone("IPhone 8", 5000.45, "White", "Apple", 2017, 5.5));
		phoneshop.AddNewDevice(new IPhone("IPhone 12", 13399.45, "Black", "Apple", 2020, 6.2));
		phoneshop.AddNewDevice(new IPhone("IPhone 11", 10999.78, "Black", "Apple", 2019, 6.1));
		phoneshop.AddNewDevice(new Samsung("Samsung Note10", 9000.42, "Gold", "Samsung", 2011, 6.3));
		phoneshop.AddNewDevice(new Samsung("Samsung Galaxy Z", 8600.42, "Green", "Samsung", 2022, 6.8));
		phoneshop.AddNewDevice(new Samsung("Samsung Galaxy S8", 16499.42, "Blue", "Samsung", 2017, 5.9));
		phoneshop.AddNewDevice(new Huawei("Huawei Y5P", 2199.42, "Blue", "Huawei", 2018, 5.8));
		phoneshop.AddNewDevice(new Huawei("Huawei D3", 4700.42, "White", "Huawei", 2022, 5.8));
		
	}
	
	@Test
	public void testCountHowManySamsungDevice() {
		int expectedValue = 3;
		int actualValue = phoneshop.CountHowManySamsungDevices();
		assertEquals((int) expectedValue, actualValue);
	}
	@Test
	public void testCountHowManyAppleDevice() {
		int expectedValue = 3;
		int actualValue = phoneshop.CountHowManyAppleDevices();
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
	public void testBlackColorDevices() {
		assertTrue(phoneshop.ContainsSpecificBlackDevices("Black"));
	}
	@Test
	public void testHowMany2018Devices() {
		int expectedValue = 1;
		int actualValue = phoneshop.HowMany2018Devices();
		assertEquals((int) expectedValue, actualValue);
		
	}
	
	@Test
	public void testNameOfExpensiveDevice() {
		Device samsungdevice1 = new Samsung("Samsung S10",7000.34,"Blue", "Samsung", 2022,7.1);
		Device samsungdevice2 = new Samsung("Samsung S8",7800.34,"Blue", "Samsung", 2022,7.1);
		phoneshop.AddNewDevice(samsungdevice1);
		phoneshop.AddNewDevice(samsungdevice2);
		assertEquals(samsungdevice2, phoneshop.NameOfMostExpensiveDevice());
	}
	@Test
	public void testNameOfCheapestDevice() {
		Device samsungdevice1 = new Samsung("Samsung S10",7000.34,"Blue", "Samsung", 2022,7.1);
		Device samsungdevice2 = new Samsung("Samsung S8",7800.34,"Blue", "Samsung", 2022,7.1);
		phoneshop.AddNewDevice(samsungdevice1);
		phoneshop.AddNewDevice(samsungdevice2);
		assertEquals(samsungdevice1, phoneshop.NameOfCheapestDevice());
	}
	@Test
	public void testLargestDisplaySize() {
		Device samsungdevice1 = new Samsung("Samsung S10",7000.34,"Blue", "Samsung", 2022,5.8);
		Device samsungdevice2 = new Samsung("Samsung S8",7800.34,"Blue", "Samsung", 2022,7.1);
		phoneshop.AddNewDevice(samsungdevice1);
		phoneshop.AddNewDevice(samsungdevice2);
		assertEquals(samsungdevice2, phoneshop.LargestDevice());
	}
	@Test
	public void testSmallestDisplaySize() {
		Device samsungdevice1 = new Samsung("Samsung S10",7000.34,"Blue", "Samsung", 2022,7.1);
		Device samsungdevice2 = new Samsung("Samsung S8",7800.34,"Blue", "Samsung", 2022,5.8);
		phoneshop.AddNewDevice(samsungdevice1);
		phoneshop.AddNewDevice(samsungdevice2);
		assertEquals(samsungdevice2, phoneshop.SmallestDevice());
	}

}
