package Company;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				PhoneShop TechCompany = new PhoneShop();
				IPhone I1 = new IPhone("IPhone 8", 5000.45, "White", "Apple", 2017, 5.5);
				IPhone I2 = new IPhone("IPhone 12", 13399.45, "Black", "Apple", 2020, 6.2);
				IPhone I3 = new IPhone("IPhone 11", 10999.78, "Black", "Apple", 2019, 6.1);
				Samsung S1 = new Samsung("Samsung Note10", 9000.42, "Gold", "Samsung", 2011, 6.3);
				Samsung S2 = new Samsung("Samsung Galaxy Z", 8600.42, "Green", "Samsung", 2022, 6.8);
				Samsung S3 = new Samsung("Samsung Galaxy S8", 16499.42, "Blue", "Samsung", 2017, 5.9);
				Huawei H1 = new Huawei("Huawei Y5P", 2199.42, "Blue", "Huawei", 2018, 5.8);
				Huawei H2 = new Huawei("Huawei D3", 4700.42, "White", "Huawei", 2022, 5.8);
				Device[] dev = new Device[3];
				dev[0] = new IPhone("", 4000.65, "", "", 2014, 3.1);
			    dev[1] = new Samsung("", 7000.34, "", "", 2015, 3.2);		
			    dev[2] = new Huawei("", 3000.78, "", "", 2016, 3.3);
			    for(int i = 0; i<3; i++) {
			    	System.out.println("Selling Price: "+dev[i].SellingPrice());
			    	System.out.println("Discount Price: "+dev[i].DiscountPrice());
			    }
				
				TechCompany.AddNewDevice(I1);
				TechCompany.AddNewDevice(I2);
				TechCompany.AddNewDevice(I3);
				TechCompany.AddNewDevice(S1);
				TechCompany.AddNewDevice(S2);
				TechCompany.AddNewDevice(S3);
				TechCompany.AddNewDevice(H1);
				TechCompany.AddNewDevice(H2);
		
	
				System.out.println("The total price of all devices: " + TechCompany.TotalPriceofDevices());
				System.out.println("The number of Samsung devices: " + TechCompany.CountHowManySamsungDevices());
				System.out.println("The number of Iphone devices: " + TechCompany.CountHowManyAppleDevices());
				System.out.println("The name of the most expensive device: " + TechCompany.NameOfMostExpensiveDevice());
				System.out.println("The name of the cheapest device: " + TechCompany.NameOfCheapestDevice());
				System.out.println("The size of the biggest device is: " + TechCompany.LargestDevice());
				System.out.println("The size of the smallest device is: " + TechCompany.SmallestDevice());
				System.out.println("The number of 2018 devices is: " + TechCompany.HowMany2018Devices());
			    System.out.println("The average price of devices is: " + TechCompany.AveragePrice());
			    System.out.println("Sells white color IPhones: " + TechCompany.ContainsSpecificWhiteDevices(null));
			    System.out.println("Sells black color Devices: " + TechCompany.ContainsSpecificBlackDevices(null));
			    
			    
		
			}
	}
