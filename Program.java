package Company;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Main {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        PhoneShop TechCompany = new PhoneShop();
        try {
            IPhone I1 = new IPhone("iPhne 13", 5000.45, "White", 2017, 5.5);
            IPhone I2 = new IPhone("IPhone 12", 13399.45, "Black", 2020, 6.2);
            IPhone I3 = new IPhone("IPhone 11", 10999.78, "Black", 2019, 6.1);
            Samsung S1 = new Samsung("Samsang Note10", 9000.42, "Gold", 2011, 6.3);
            Samsung S2 = new Samsung("Samsung Galaxy Z", 8600.42, "Green", 2022, 6.8);
            Samsung S3 = new Samsung("Samsung Galaxy S23", 16499.42, "Blue", 2017, 5.9);
            Huawei H1 = new Huawei("Huawee Y5P", 2199.42, "Blue", 2018, 5.8);
            Huawei H2 = new Huawei("Huawei D3", 4700.42, "White", 2022, 5.8);
            Device[] dev = new Device[3];
            dev[0] = new IPhone("IPhone 7", 4000.65, "Black", 2014, 3.1);
            dev[1] = new Samsung("Samsung Galaxy", 7000.34, "Black", 2015, 3.2);
            dev[2] = new Huawei("Huawei D2", 3000.78, "Black", 2016, 3.3);
            for (int i = 0; i < 3; i++) {
                System.out.println("Selling Price: " + dev[i].SellingPrice());
                System.out.println("Discount Price: " + dev[i].DiscountPrice());
            }
            I1.fixMisspelledCharacters();
            I2.fixMisspelledCharacters();
            I3.fixMisspelledCharacters();
            S1.fixMisspelledCharacters();
            S2.fixMisspelledCharacters();
            S3.fixMisspelledCharacters();
            H1.fixMisspelledCharacters();
            H2.fixMisspelledCharacters();
            
           
            
            TechCompany.AddNewDevice(I1);
            TechCompany.AddNewDevice(I2);
            TechCompany.AddNewDevice(I3);
            TechCompany.AddNewDevice(S1);
            TechCompany.AddNewDevice(S2);
            TechCompany.AddNewDevice(S3);
            TechCompany.AddNewDevice(H1);
            TechCompany.AddNewDevice(H2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Device array is full");
//} catch (Exception e) {
//            e.printStackTrace();
        } finally {
            System.out.println(" The device was added");

        }


        System.out.println("The total price of all devices: " + TechCompany.TotalPriceofDevices());
        System.out.println("The number of Samsung devices sold: " + TechCompany.CountHowManySamsungDevices());
        System.out.println("The number of Iphone 8 devices sold: " + TechCompany.CountHowManyIphone13Devices());
        System.out.println("The number of Huawei devices sold: " + TechCompany.CountHowManyHuaweiDevices());
        System.out.println("The name of the most expensive device sold: " + TechCompany.NameOfMostExpensiveDevice());
        System.out.println("The name of the cheapest device sold: " + TechCompany.NameOfCheapestDevice());
        System.out.println("The size of the biggest device sold is : " + TechCompany.LargestDevice());
        System.out.println("The size of the smallest device sold is: " + TechCompany.SmallestDevice());
        System.out.println("The number of 2018 devices is: " + TechCompany.HowMany2018Devices());
        try {
            System.out.println("The average price of devices is: " + TechCompany.AveragePrice());

        } catch (ArithmeticException e) {
            System.out.println("No device to calculate average");
        } finally {
            System.out.println("Average calculated");
        }

        System.out.println("If the Phone company sells white color IPhones: " + TechCompany.ContainsSpecificWhiteDevices(null));
        System.out.println("If the Phone company sells black color Devices: " + TechCompany.ContainsSpecificBlackDevices(null));
        System.out.println("If there is any Nokia devices sold: " + TechCompany.ContainsSpecificHisenseDevices(null));
        System.out.println("Was there a Huawei D3 sales: " + TechCompany.FindIfHuaweiD3WasSold(null));
        try {
            System.out.println("Device name with character ua found: " + TechCompany.DeviceNameContainUA());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No device name with ua or UA found");
        } finally {
            System.out.println("Device found");
        }
        try {
            TechCompany.SaveDeviceInfo(null);
        } catch (FileAlreadyExistsException e) {
            System.out.println("The file you are trying to create already exist");
        } finally {
            System.out.println("File successfully created");
        }
        try {
            TechCompany.ReadDeviceInfo(null);
        } catch (FileNotFoundException e) {
            System.out.println("The file you are trying to open does not exist");
        } finally {
            System.out.println("File opened");
        }
    }
}
