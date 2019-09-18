package OoPs.OverLoad;
/*Type Promotion table:
The data type on the left side can be promoted to the any of the data type present in the right side of it.

byte → short → int → long
short → int → long
int → long → float → double
float → double
long → float → double

 */

public class TypePromotion1 {
    void disp(int a, double b){
        System.out.println("Method A");
    }
    void disp(int a, double b, double c){
        System.out.println("Method B");
    }
    void disp(int a, float b){
        System.out.println("Method C");
    }
    public static void main(String args[]){
        TypePromotion1 obj = new TypePromotion1();
        /* This time promotion won't happen as there is
         * a method with arg list as (int, float)
         */
        obj.disp(100, 20.67f);
    }
}
