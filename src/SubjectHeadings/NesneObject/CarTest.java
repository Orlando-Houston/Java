package SubjectHeadings.NesneObject;

public class CarTest {
    public static void main(String[] args) {

        //degisken//deger aliyor
        Car car1=new Car();   //arabanin iskeletini urettim.
        car1.brand="Mercedes";
        car1.marque="cla180";
        car1.color="black";
        car1.year=2020;



        Car car2=new Car();
        car2.brand="honda";
        car2.marque="civic";
        car2.color="ice blue";
        car2.year=2007;


        System.out.println(car1);
        System.out.println("brand:"+car1.brand);
        System.out.println("marque:"+car1.marque);
        System.out.println("color:"+car1.color);
        System.out.println("year:"+car1.year);




        System.out.println(car2);
        System.out.println("brand:"+car2.brand);
        System.out.println("marque:"+car2.marque);
        System.out.println("color:"+car2.color);
        System.out.println("year:"+car2.year);


    }
}
