package Oracle;

public class Box1 {
    double width;
    double height;
    double depth;
}
class greenBox{
    public static void main(String[] args) {
        Box1 myBottleGreen=new Box1 ();
        Box1 myLightGreen=new Box1 ();
        double vol;

        //assign values to myBottleGreen's instance variables
        myBottleGreen.width=10;
        myBottleGreen.height=20;
        myBottleGreen.depth=15;
        //assign values to myBottleGreen's instance variables
        myLightGreen.width=3;
        myLightGreen.height=6;
        myLightGreen.depth=9;

        //compute volume of first box
        vol=myBottleGreen.depth*myBottleGreen.width*myBottleGreen.height;
        System.out.println ("Volume is"+vol);

        //compute volume of second box
        vol=myLightGreen.width*myLightGreen.height*myLightGreen.depth;
        System.out.println ("volume is"+vol);


    }
}
