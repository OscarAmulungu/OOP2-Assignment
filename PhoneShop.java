package Company;

public class PhoneShop {
	private Device[] dev;
	private int amount;
	public PhoneShop(){
		dev = new Device[1000];
		amount = 0;
	}
	
	
	public void AddNewDevice(Device newDevice){
		if(amount<1000) {
			dev[amount]= newDevice;
			++amount;
		}
	}
	
	public Integer CountHowManySamsungDevices(){
		int count = 0;
		for(int i = 0; i<amount; i++) {
			if(dev[i].GetBrand()==("Samsung")){
				count++;
			}
		}
		return count;
	}
	public Integer CountHowManyIphone8Devices(){
		int count = 0;
		for(int i = 0; i<amount; i++) {
			if(dev[i].GetName()==("Iphone 8")){
				count++;
			}
		}
		return count;
	}
	public Integer CountHowManyHuaweiDevices(){
		int count = 0;
		for(int i = 0; i<amount; i++) {
			if(dev[i].GetBrand()==("Huawei")){
				count++;
			}
		}
		return count;
	}
	public String NameOfMostExpensiveDevice(){
		double expensive = dev[0].GetPrice();
		String Name = dev[0].GetName();
		for(int i = 1; i<amount; i++) {
			if(dev[i].GetPrice()> expensive) {
				expensive = dev[i].GetPrice();
				Name = dev[i].GetName();
			}
		}return Name;
		
	}
	public String NameOfCheapestDevice(){
		double cheapest = dev[0].GetPrice();
		String Name =dev[0].GetName();
		for(int i = 1; i<amount; i++) {
			if(dev[i].GetPrice()< cheapest) {
				cheapest = dev[i].GetPrice();
				Name =dev[i].GetName();
			}
		}return Name;
		
	}
	public Double TotalPriceofDevices(){
		double sum = 0;
		for(int i = 0; i< amount; i++) {
			sum = sum + dev[i].GetPrice();
		}return sum;
	}
	
	public Double AveragePrice(){
		int sum = 0;
		for(int i =0; i< amount; i++) {
			sum = (int) (sum + dev[i].GetPrice());
		}
		double average = sum/amount;
		return average;
	}
	public Boolean ContainsSpecificWhiteDevices(String string){
		for(int i =0; i<amount; i++) {
			if("White".equalsIgnoreCase(dev[i].GetColor())) {
				return true;
			}
		}return false;
	}
	public Boolean ContainsSpecificBlackDevices(String string){
		for(int i =0; i<amount; i++) {
			if("Black".equalsIgnoreCase(dev[i].GetColor())) {
				return true;
			}
		}return false;
	}
	public Boolean ContainsSpecificNokiaDevices(String string){
		for(int i =0; i<amount; i++) {
			if("Nokia".equalsIgnoreCase(dev[i].GetBrand())) {
				return true;
			}
		}return false;
	}
	public Double LargestDevice(){
		Double largest = dev[0].GetDisplaySize();
		for(int i = 1; i<amount; i++) {
			if(dev[i].GetDisplaySize()> largest) {
				largest = dev[i].GetDisplaySize();
			}
		}return largest;
		
	}
	public Double SmallestDevice(){
		Double smallest = dev[0].GetDisplaySize();
		for(int i = 1; i<amount; i++) {
			if(dev[i].GetDisplaySize()< smallest) {
				smallest = dev[i].GetDisplaySize();
			}
		}return smallest;
		
	}
	public Integer HowMany2018Devices(){
		int count = 0;
		for(int i = 0; i<amount; i++) {
			if(dev[i].GetYear()== 2018){
				count++;
			}
		}
		return count;
	}
	
}
