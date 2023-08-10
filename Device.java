package Company;

public abstract class Device {
	protected String Name;
	protected Double BasicPrice;
	protected String Color;
	protected String Brand;
	protected int Year;
	protected Double DisplaySize;
	public Device(String nN, Double nP, String nC, String nB, int nY, Double nDS) {
		this.Name = nN;
		this.BasicPrice = nP;
		this.Color = nC;
		this.Brand = nB;
		this.Year = nY;
		this.DisplaySize =nDS;
	}
	
	public String GetName(){
		return Name;
	}
	public Double GetBasicPrice(){
		return BasicPrice;
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
	public Double GetDisplaySize(){
		return DisplaySize;
	}
	//Polymorphism
	public abstract Double SellingPrice();
	//Polymorphism
    public abstract Double DiscountPrice();
}
