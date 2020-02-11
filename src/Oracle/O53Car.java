package Oracle;

public class O53Car extends O53ConstVeh {
    int y;

    O53Car(){
      //  this.x=x; bu sekilde de yazabiliriz...cunku acces modifier not private..
        //bunu yazinca superi yazmamamiz gerekiyor

        super();
     //  this();            //compiler error


    }
    O53Car(int y){
        this.y=y;

    }
    public  String toString(){
        return super.x+":"+y;      //this.y olarakta call yapilabilir
    }

    public static void main(String[] args) {
        O53ConstVeh y=new O53ConstVeh ();
        System.out.println (y);
    }
}

