package Cours.Aug10Review;



public class BicycleTest {
    public static void main(String[] args) {

        Bicycle myBic = new Bicycle(18, "yellow");
        System.out.println(myBic.size);
        System.out.println(myBic.color);

        Bicycle1 myBic1=new Bicycle1(16,"black");
        System.out.println(myBic1.size);
        System.out.println(myBic1.color);

        Bicycle2 myStd=new Bicycle2();
        System.out.println(myStd.size);
        System.out.println(myStd.color);



    }


}
