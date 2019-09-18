package Cours.Aug10Review;

public class BicycleTest3 {
    public static void main(String[] args) {
        Bicycle3 myBike=new Bicycle3(16,"lime"); //with parameter construction


        System.out.println("Custom Bike");
        System.out.println(myBike.size);
        System.out.println(myBike.color);

        System.out.println("Standart Bike");
        Bicycle3 myStd=new Bicycle3();
        System.out.println(myStd.size);
        System.out.println(myStd.color);

        System.out.println("Standart Bike1"); //without parameter
        Bicycle3 myStd1=new Bicycle3();
        System.out.println(myStd1.size);
        System.out.println(myStd1.color);

        if (myStd==myStd1){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }

        System.out.println(myStd);
        System.out.println(myStd1);
        System.out.println(myBike);

        myBike.goFast();
        myStd.goSlow();
        myStd1.goFaster();

    }


}
