package Company;

public class IPhone extends Device {

    public IPhone(String nN, Double nP, String nC,  Integer nY, Double nDS) {
        super(nN, nP , nC, nY, nDS);
        if(nP <= 0) {
			throw new IllegalArgumentException("Price must be a positive value");
		}
	}
        
    
    @Override
    public Double SellingPrice() {
        return BasicPrice + BasicPrice*0.5;
    }
    @Override
    public Double DiscountPrice(){
        return SellingPrice() - 800;
    }
}
