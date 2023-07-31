package Company;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				PhoneShop TechCompany = new PhoneShop();
				IPhone I1 = new IPhone("IPhone 8", 3000.45, "White", "Apple", 2019, 10);
				IPhone I2 = new IPhone("IPhone 11", 8000.78, "Silver", "Apple", 2021, 11);
				Samsung S1 = new Samsung("Samsung note", 6000.42, "Gold", "Samsung", 2017, 10);
				Samsung S2 = new Samsung("Samsung J5", 3600.42, "Black", "Samsung", 2016, 9);
				Huawei H1 = new Huawei("Huawei D2", 4500.42, "Blue", "Huawei", 2018, 10);
				Huawei H2 = new Huawei("Huawei D3", 4700.42, "White", "Huawei", 2022, 10);
				
				TechCompany.AddNewDevice(I1);
				TechCompany.AddNewDevice(I2);
				TechCompany.AddNewDevice(S1);
				TechCompany.AddNewDevice(S2);
				TechCompany.AddNewDevice(H1);
				TechCompany.AddNewDevice(H2);
		
				
				System.out.println("The cost of all devices: " + TechCompany.CostOfAllDevices());
				System.out.println("The number of Samsung devices: " + TechCompany.CountHowManySamsungDevices());
				System.out.println("The number of Iphone devices: " + TechCompany.CountHowManyAppleDevices());
				System.out.println("The name of the most expensive device: " + TechCompany.NameOfMostExpensiveDevice());
				System.out.println("The name of the cheapest device: " + TechCompany.NameOfCheapestDevice());
				System.out.println("The size of the biggest device is: " + TechCompany.LargestDevice());
				System.out.println("The size of the smallest device is: " + TechCompany.SmallestDevice());
				System.out.println("The number of 2018 devices is: " + TechCompany.HowMany2018Devices());
			    System.out.println("The average price of devices is: " + TechCompany.AveragePrice());
			    System.out.println("Sells white color IPhones: " + TechCompany.ContainsSpecificWhiteDevices());
			    System.out.println("Sells black color Devices: " + TechCompany.ContainsSpecificBlackDevices());
			    
			    
		
			}
	}
