package Udemy;

public class ConditionalOperators {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=true;
        boolean d=a&&b;//false
        boolean e=a||b;//true

        System.out.println ("d="+d+" " +"e="+e);

        int f=4;
        boolean g=false&&(f++<4);  //(f++<4) is never executed(short -circuiting)

        boolean h=(f--==4)&&!g;// true && !g, f=3

        System.out.println ("f="+f+" "+"g="+ g+" "+ "h="+ h);

        int  myInt=3;
        int anotherInt=4;
        boolean myBoolean=(myInt<=3 )&&(anotherInt--==4)||(myInt++==4);
        System.out.println (myInt);
        System.out.println (anotherInt);
        System.out.println (myBoolean);


        boolean x=true,z=true;
        int y=20;
        x=(y!=10)^(z=false);//
        //true ^false-->true

        //x=true,  y=20;  z=false
        System.out.println (x+" "+ y+" "+z);

    }
}
