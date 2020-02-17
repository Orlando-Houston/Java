package Oracle;

public class AddMethThatTakesParameters {
    double width;
    double height;
    double depth;

    //compute and return volume
    double volume(){
        return width*height*depth;
    }
    //sets dimensions of box
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;

    }
}
class boxDemo5{
    public static void main(String[] args) {
        AddMethThatTakesParameters myBox5=new AddMethThatTakesParameters ();
        AddMethThatTakesParameters myBox6=new AddMethThatTakesParameters ();
        double vol;

        //initialize each box
        myBox5.setDim (10,20,30);
        myBox6.setDim (3,6,9);

        vol=myBox5.volume ();
        System.out.println ("volume is"+vol);

        vol=myBox6.volume ();
        System.out.println ("volume is"+vol);
    }
}
