package Oracle;

public class AddAMethodToTheBoxClass {
    double width;
    double height;
    double depth;
    //display volume of box
    void volume(){
        System.out.print ("Volum is ");
        System.out.println (width*height*depth);
    }
}
class BoxDemo3{
    public static void main(String[] args) {
        AddAMethodToTheBoxClass myBox3=new AddAMethodToTheBoxClass ();
        AddAMethodToTheBoxClass myBox4=new AddAMethodToTheBoxClass ();

        //assign values to mybox3's instance variables

        myBox3.depth=3;
        myBox3.height=6;
        myBox3.width=9;

        //assign different values to mybox4's
        myBox4.width=10;
        myBox4.height=15;
        myBox4.depth=20;

        //display volume of first box
        myBox3.volume ();
        //display volume of second box
        myBox4.volume ();
    }
}
