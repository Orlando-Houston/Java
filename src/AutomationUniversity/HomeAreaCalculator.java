package AutomationUniversity;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        //create instance of rectangle class
        RectangleClsAndObj room1=new RectangleClsAndObj ();
        room1.setWidth (25);
        room1.setLength (50);
        double areaOfRoom1=room1.calculateArea ();
        System.out.println (areaOfRoom1);


        //create instance of rectangle class
        RectangleClsAndObj room2=new RectangleClsAndObj (30,75);
        double areaOfRoom2=room2.calculateArea ();
        System.out.println (areaOfRoom2);
        double totalArea=areaOfRoom1+areaOfRoom2;
        System.out.println (totalArea);


    }
}
