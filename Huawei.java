package Company;

//Inheritance
public class Huawei extends Device {

	public Huawei(String nN, Double nP, String nC, String nB, Integer nY, Integer nS) {
		super(nN, nP, nC, nB, nY, nS);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double SellingPrice() {
		return Price + Price*0.3;
	}
	@Override
	public Double DiscountPrice(){
		return Price - 100;
	}
}
