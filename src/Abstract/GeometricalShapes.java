package Abstract;

import java.security.PublicKey;

public abstract class GeometricalShapes {
    private String object;
    public void objectName(String object){
        this.object=object; //geometrical objects names

    }
    public String objectBring(){
        return object;//sekilllerin ismini dondurecek method
    }

    public static void main(String[] args) {
        //nesneleri olusturuyoruz
        Triangle trg=new Triangle ();
        Rectangle rtg=new Rectangle ();
        Circle crl=new Circle ();


        trg.features (10,23);
       // System.out.println (trg.objectBring ()+": ");//null
        System.out.println (trg.calculateArea ());

        rtg.features (12,9);
        System.out.println (rtg.objectBring ()+": ");
        System.out.println (rtg.calculateArea ());


        crl.features (3.0);
        System.out.println (crl.objectBring ()+": ");
        System.out.println (crl.calculateArea ());




    }
    public abstract  double calculateArea();//abstract method

}
