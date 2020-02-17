package AutomationUniversity;

import java.util.Scanner;

public class HomeCalculator2 {

    public static void main(String[] args) {
       HomeCalculator2 calculator=new HomeCalculator2 ();//this part wroten  the latest  4
        RectangleClsAndObj kitchen=calculator.getRoom();//1
        RectangleClsAndObj bathroom=calculator.getRoom();//2

        double area=calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println (area);
    }
    public RectangleClsAndObj getRoom() {
        Scanner enter = new Scanner (System.in);

        System.out.println ("enter the length of your room");
        double length = enter.nextDouble ();

        System.out.println ("enter the length f your room");
        double width = enter.nextDouble ();
        return new RectangleClsAndObj (length,width);

    }
    public double calculateTotalArea(RectangleClsAndObj rec1,RectangleClsAndObj rec2){
        return rec1.calculateArea ()+rec2.calculateArea ();
    }
}
