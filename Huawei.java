package Company;


public class Huawei extends Device {

    public Huawei(String nN, Double nP, String nC, Integer nY, Double nDS) {
        super(nN, nP, nC,  nY, nDS);
        if(nP <= 0) {
			throw new IllegalArgumentException("Price must be a positive value");
		}
	}
        // TODO Auto-generated constructor stub
   
    @Override
    public Double SellingPrice() {
        return BasicPrice + BasicPrice*0.3;
    }
    @Override
    public Double DiscountPrice(){
        return SellingPrice() - 200;
    }
}
