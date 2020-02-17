package Oracle;

public class ConstructorsBox {
    double width;
    double height;
    double depth;
    //this is  the constructor for box.
    ConstructorsBox(){
        System.out.println ("constructing box");
        width=10;
        height=10;
        depth=10;
    }
    //compute and return volume
    double volume(){
        return width*height*depth;

    }
}
class BoxDemo7{
    public static void main(String[] args) {
        //declare ,allocate,and initialize box objects
        ConstructorsBox myBoxBlue=new ConstructorsBox ();
        ConstructorsBox myBocNavy=new ConstructorsBox ();

        double vol;

        //get volume of first box
        vol =myBocNavy.volume ();
        System.out.println ("volum is navy"+vol);

        vol=myBoxBlue.volume ();
        System.out.println ("volum is navy"+vol);
    }
}
