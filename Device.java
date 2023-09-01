package Company;

public abstract class Device {
    protected String Name;
    protected Double BasicPrice;
    protected String Color;
    protected int Year;
    protected Double DisplaySize;
    public Device(String nN, Double nP, String nC, int nY, Double nDS) {
        this.Name = nN;
        this.BasicPrice = nP;
        this.Color = nC;
        this.Year = nY;
        this.DisplaySize =nDS;
    }

    public String GetName(){
        return Name;
    }
    public void SetName(String Name) {
    	this.Name = Name;
    }
    public Double GetBasicPrice(){
        return BasicPrice;
    }
    public String GetColor(){
        return Color;
    }
    
    public int GetYear(){
        return Year;
    }
    public Double GetDisplaySize(){
        return DisplaySize;
    }
    //String Manipulation
    public void fixMisspelledCharacters() {
        String correctedName = GetName();
        // Replace misspelled characters as needed
        correctedName = correctedName.replace("Samsang", "Samsung");
        correctedName = correctedName.replace("Samsun", "Samsung");
        correctedName = correctedName.replace("Samsng", "Samsung");
        correctedName = correctedName.replace("Samsumg", "Samsung");
        correctedName = correctedName.replace("iPhne", "IPhone");
        correctedName = correctedName.replace("Huawee", "Huawei");
        correctedName = correctedName.replace("Huwei", "Huawei");
        // Update the name with corrected name
        SetName(correctedName);
}
    //Polymorphism
    public Double SellingPrice() {
    return 0.0;
    }
    //Polymorphism
    public Double DiscountPrice() {
    	return 0.0;
    }
}
