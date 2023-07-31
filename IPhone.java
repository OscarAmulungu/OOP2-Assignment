package Company;

//Inheritance
public class IPhone extends Device {

	public IPhone(String nN, Double nP, String nC, String nB, Integer nY, Integer nS) {
		super(nN, nP , nC, nB, nY, nS);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double SellingPrice() {
		return Price + Price*0.7;
	}
	@Override
	public Double DiscountPrice(){
		return Price - 500;
	}
}