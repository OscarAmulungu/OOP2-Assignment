package Company;

//Inheritance
public class IPhone extends Device {

	public IPhone(String nN, Double nP, String nC, String nB, Integer nY, Double nDS) {
		super(nN, nP , nC, nB, nY, nDS);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double SellingPrice() {
		return Price + Price*0.5;
	}
	@Override
	public Double DiscountPrice(){
		return SellingPrice() - 800;
	}
}
