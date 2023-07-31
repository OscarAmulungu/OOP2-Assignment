package Company;

public abstract class Device {
	protected String Name;
	protected Double Price;
	protected String Color;
	protected String Brand;
	protected int Year;
	protected int Size;
	public Device(String nN, Double nP, String nC, String nB, int nY, int nS) {
		this.Name = nN;
		this.Price = nP;
		this.Color = nC;
		this.Brand = nB;
		this.Year = nY;
		this.Size =nS;
	}
	
	public String GetName(){
		return Name;
	}
	public Double GetPrice(){
		return Price;
	}
	public String GetColor(){
		return Color;
	}
	public String GetBrand(){
		return Brand;
	}
	public int GetYear(){
		return Year;
	}
	public int GetSize(){
		return Size;
	}
	//Polymorphism
	public Double SellingPrice(){
		return Price;
	
	}
	//Polymorphism
	public Double DiscountPrice() {
		
	return Price - 200;
	}
}