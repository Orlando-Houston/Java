package Oracle;

class Product{
    double price;
}

public class Test {
    public void uptadePrice(Product product,double price){
        price=price*2;
        product.price =product.price+price;

    }
    public static void main(String[] args) {
        Product prt=new Product ();
        double newPrice=100;
        prt.price=200;

        Test t=new Test ();
        t.uptadePrice (prt,newPrice);
        System.out.println (prt.price+":"+newPrice);
        }

    }

