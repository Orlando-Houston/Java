package Cours.Aug3Saturday;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(16,"lime"); //instance created with parameter Constructor

        System.out.println("Custom Bike");
        System.out.println(myBike.color);
        System.out.println(myBike.size);

        System.out.println("Standard Bike");
        Bicycle myStd = new Bicycle(); //instance created with Constructor without parameter
        System.out.println(myStd.color);
        System.out.println(myStd.size);

        System.out.println("Standard 2");
        Bicycle myStd2 = new Bicycle(); //instance created with Constructor without parameter
        System.out.println(myStd2.color);
        System.out.println(myStd2.size);

        if(myStd==myStd2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        System.out.println(myStd);
        System.out.println(myStd2);
        System.out.println(myBike);

        myBike.goFast();
        myStd.goSlow();
        myStd2.goFaster();

    }
}

