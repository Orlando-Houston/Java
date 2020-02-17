package Oracle;

public class Box {
    double width;
    double height;
    double depth;
}

//this class declares an object of the type Box
class  BoxDemo{
    public static void main(String[] args) {
        Box myBox=new Box ();
        double vol;

        //assign values to mybox's instance variables
        myBox.width=10;
        myBox.height=20;
        myBox.depth=15;

        //compute volume of box
        vol=myBox.depth*myBox.height*myBox.width;
        System.out.println ("volum is"+vol);

    }
}
