package Oracle;



class Prod{
    double price;
}

public class O1Product {

    public void updatePrice(Prod prod,double price){
        price=price*2;
        prod.price=prod.price+price;

    }

    public static void main(String[] args) {
        Prod prt=new Prod ();
        prt.price=200;

        double newPrice=100;

        O1Product t=new O1Product ();t.updatePrice (prt,newPrice);
        System.out.println (prt.price+": "+newPrice);

    }

}

