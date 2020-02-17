package Oracle;

public class ParameterizedConstr {
    double width;
    double height;
    double depth;
    //this is the constructor for box
    ParameterizedConstr(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    //compute and return volume
    double volume(){
        return width*height*depth;
    }
}
class BoxDemo8{
    public static void main(String[] args) {
        //declare ,allocate and initialize box objects
        ParameterizedConstr myYellowBox=new ParameterizedConstr (10,20,30);
        ParameterizedConstr myREdBox=new ParameterizedConstr (50,60,70);
        ParameterizedConstr myWhiteBox=new ParameterizedConstr (80,90,100);

        double vol;

        vol=myREdBox.volume ();
        System.out.println ("volum is" +vol);

        vol=myWhiteBox.volume ();
        System.out.println ("volum is" +vol);
        vol=myYellowBox.volume ();
        System.out.println ("volum is" +vol);

    }
}
