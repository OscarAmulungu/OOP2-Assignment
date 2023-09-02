package Company;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class PhoneShop {
    private Device[] dev;
    private int amount;

    public PhoneShop() {
        dev = new Device[1000];
        amount = 0;
    }

    public void AddNewDevice(Device newDevice) throws Exception {

        try {
            if (amount < 1000) {
                dev[amount] = newDevice;
                ++amount;
            }
        } catch (Exception e) {
            e = new Exception();
            throw e;
        }

    }

    public Integer CountHowManySamsungDevices() {
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (dev[i].GetName() == ("Samsung Galaxy")) {
                count++;
            }
        }
        return count;
    }

    public Integer HowMany2018Devices() {
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (dev[i].GetYear() == 2018) {
                count++;
            }
        }
        return count;
    }

    public Integer CountHowManyIphone13Devices() {
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (dev[i].GetName() == ("IPhone 13")) {
                count++;
            }
        }
        return count;
    }

    public Integer CountHowManyHuaweiDevices() {
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (dev[i].GetName() == ("Huawei D3")) {
                count++;
            }
        }
        return count;
    }

    public String NameOfMostExpensiveDevice() {
        double expensive = dev[0].GetBasicPrice();
        String Name = dev[0].GetName();
        for (int i = 1; i < amount; i++) {
            if (dev[i].GetBasicPrice() > expensive) {
                expensive = dev[i].GetBasicPrice();
                Name = dev[i].GetName();
            }
        }
        return Name;

    }

    public String NameOfCheapestDevice() {
        double cheapest = dev[0].GetBasicPrice();
        String Name = dev[0].GetName();
        for (int i = 1; i < amount; i++) {
            if (dev[i].GetBasicPrice() < cheapest) {
                cheapest = dev[i].GetBasicPrice();
                Name = dev[i].GetName();
            }
        }
        return Name;

    }

    public Double LargestDevice() {
        Double largest = dev[0].GetDisplaySize();
        for (int i = 1; i < amount; i++) {
            if (dev[i].GetDisplaySize() > largest) {
                largest = dev[i].GetDisplaySize();
            }
        }
        return largest;

    }

    public Double SmallestDevice() {
        Double smallest = dev[0].GetDisplaySize();
        for (int i = 1; i < amount; i++) {
            if (dev[i].GetDisplaySize() < smallest) {
                smallest = dev[i].GetDisplaySize();
            }
        }
        return smallest;

    }

    public Double AveragePrice() throws Exception {
        int sum = 0;
        if (amount == 0) {
            Exception e = new Exception();
            throw e;

        } else {
            for (int i = 0; i < amount; i++) {
                sum = (int) (sum + dev[i].GetBasicPrice());
            }
        }
        double average = sum / amount;
        return average;
    }

    public Double TotalPriceofDevices() {
        double sum = 0;
        for (int i = 0; i < amount; i++) {
            sum = sum + dev[i].GetBasicPrice();
        }
        return sum;
    }

     public Boolean ContainsSpecificWhiteDevices(String color){
		for(int i =0; i<amount; i++) {
			if(dev[i].GetColor()== "White") {
				return true;
			}
		}return false;
	}
    public Boolean ContainsSpecificHisenseDevice(String name){
		for(int i =0; i<amount; i++) {
			if(dev[i].GetName()== "Nokia") {
				return true;
			}
		}return false;
	}
//String Manipulation
    public String DeviceNameContainUA() throws Exception {
        String nameUA = "";
        try {
            for (int i = 0; i < amount; i++) {
                if ((dev[i].GetName().contains("ua")) || (dev[i].GetName().contains("UA"))) {

                    nameUA += dev[i].GetName();
                }
            }
        } catch (Exception e) {
            e = new Exception();
            throw e;
        }
        return nameUA;
    }

    public void SaveDeviceInfo(String filename) throws Exception {
        File file = null;
        PrintWriter DI = null;
        try {
            file = new File("C:\\Users\\Admin\\Desktop\\Devices.txt");
            DI = new PrintWriter(file);
            for (int i = 0; i < amount; i++) {
                DI.println(dev[i].toString());
                DI.println(dev[i].GetName());
                DI.println(dev[i].GetYear());
                DI.println(dev[i].GetColor());
                DI.println(dev[i].GetBasicPrice());
                
            }
        } catch (Exception e) {
            throw e;
        } finally {
            DI.close();
        }
    }

    public void ReadDeviceInfo(String filename) throws Exception {
        File file = null;
        Scanner DI = null;
        try {
            file = new File("C:\\Users\\Admin\\Desktop\\Devices.txt");
             DI = new Scanner(file);
            while (DI.hasNextLine())
                System.out.println(DI.nextLine());
        } catch (Exception e) {
            throw e;
        } finally {
            DI.close();
        }
    }
    
}
