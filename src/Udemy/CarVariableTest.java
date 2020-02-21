package Udemy;

public class CarVariableTest {
    public static void main(String[] args) {



        //create new object
        CarVariableStatc car1=new CarVariableStatc ();


        CarVariableStatc car2; //create reference  but  dosn't assigment anything Object
       //  car2.motor= //problem



        CarVariableStatc car3=null;//this reference dosn't  point anywhere(object)
       // car3.//method;  result  null pointer exception



        car1.motor="16V";
        car1.tire=4;
        car1.doors=4;                                      //static variable
        car1.model="Jeep";                                //static variable
        car1.color="tornado grey";





        //static variable
        System.out.println ("motor="+car1.motor);
        System.out.println ("tire="+ car1.tire);
        System.out.println ("doors="+car1.doors);
        System.out.println ("model="+car1.model);
        System.out.println ("color="+car1.color);

    }
}
