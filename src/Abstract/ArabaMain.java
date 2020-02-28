package Abstract;

import SubjectHeadings.StringClass.A;

public class ArabaMain {
    public static void main(String[] args) {
        Araba  ford=new Ford ();
        ford.setAgirlik (1000);
        ford.setModel ("Fiesta");
        ford.setRenk ("strom grey");



        Araba  jeep=new Jeep ();
        jeep.setAgirlik (2000);
        jeep.setModel ("jeep");
        jeep.setRenk ("strom grey");


        Araba arabalar[]=new Araba[]{jeep,ford};
        userScreen screen=new userScreen ();
        screen.show (arabalar);

    }
}
