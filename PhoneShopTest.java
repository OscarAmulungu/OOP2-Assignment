package Company;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class PhoneShopTest {
	private PhoneShop phoneshop;
	
	@Before
	public void setUp() throws Exception {
		phoneshop = new PhoneShop();
		phoneshop.AddNewDevice(new IPhone("IPhone 13", 15000.0, "White", 2023, 6.0));
		phoneshop.AddNewDevice(new Huawei("Huawei D3", 6000.0, "Black", 2018, 5.9));
		phoneshop.AddNewDevice(new Samsung("Samsung J5", 3000.0, "Black", 2018, 5.8));
		phoneshop.AddNewDevice(new Samsung("Samsung J7", 4000.0, "Black", 2019, 6.0));
	}
	@Test
	public void testTotalPrice() throws Exception {
		Double expectedAveragePrice = 15000.0+ 6000.0 +3000.0+ 4000.0;
		assertEquals(expectedAveragePrice, phoneshop.TotalPriceofDevices());
	}
	@Test
	public void testAveragePrice() throws Exception {
		Double expectedAveragePrice = (15000.0+6000.0+3000.0+4000.0)/4;
		assertEquals(expectedAveragePrice, phoneshop.AveragePrice(),0.001);
	}
	@Test
	public void testWhiteColorDevices() {
		assertTrue(phoneshop.ContainsSpecificWhiteDevices("White"));
	}
	
	@Test
	public void testHowMany2018Devices() {
		int expectedValue = 2;
		int actualValue = phoneshop.HowMany2018Devices();
		assertEquals((int) expectedValue, actualValue);
		
	}
	@Test
	public void testHowManySamsungDevices() {
		int expectedValue = 2;
		int actualValue = phoneshop.CountHowManySamsungDevices();
		assertEquals((int) expectedValue, actualValue);
		
	}
	@Test
	public void testHowManyIPhone13Devices() {
		int expectedValue = 1;
		int actualValue = phoneshop.CountHowManyIphone13Devices();
		assertEquals((int) expectedValue, actualValue);
		
	}
	@Test
	public void testHowManyHuaweiDevices() {
		int expectedValue = 1;
		int actualValue = phoneshop.CountHowManyHuaweiDevices();
		assertEquals((int) expectedValue, actualValue);
		
	}
	@Test
	public void testNameOfExpensiveDevice() {
		String expectedValue = "IPhone 13";
		String actualValue = phoneshop.NameOfMostExpensiveDevice();
		assertEquals(expectedValue, actualValue);
	}
	@Test
	public void testNameOfCheapestDevice() {
		String expectedValue = "Samsung J5";
		String actualValue = phoneshop.NameOfCheapestDevice();
		assertEquals(expectedValue, actualValue);
	}
	@Test
	public void testLargestDisplaySize() {
		Double expectedValue = 6.0;
		Double actualValue = phoneshop.LargestDevice();
		assertEquals(expectedValue, actualValue);
	}
	@Test
	public void testSmallestDisplaySize() {
		Double expectedValue = 5.8;
		Double actualValue = phoneshop.SmallestDevice();
		assertEquals(expectedValue, actualValue);
	}
	
}

