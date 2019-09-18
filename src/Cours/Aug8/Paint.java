package Cours.Aug8;

public class Paint {
    //construction
    protected String colorName;
    protected double sqrFeet;
    protected double totalPrice;
    public Paint(String colorName,double price,double sqrFeet){
        this.colorName=colorName;
        this.totalPrice=price;
        this.sqrFeet=sqrFeet;
    }
    protected void calculatePrice(double sqrFeet){
        this.totalPrice=sqrFeet/100*32.99;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", sqrFeet=" + sqrFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}





