package OoPs.Super;
//Parent class or Superclass or base class

public class SuperClass {
    int num = 100;
}
//Child class or subclass or derived class
class Subclass extends SuperClass{
    /* The same variable num is declared in the Subclass
     * which is already present in the Superclass
     */
    int num = 110;
    void printNumber(){
        System.out.println(super.num);  //num in yanina super kelimesini  getirdigimizde parent clasa ulasiriz.sup.num
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.printNumber();
    }
}  //this scop clas subclass extends superclass with together