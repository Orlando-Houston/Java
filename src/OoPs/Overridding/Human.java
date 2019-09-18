package OoPs.Overridding;

public class Human {
    //overriden method
    public void eat(){
        System.out.println("Human is eating");
    }
}
class Boy extends Human{
    //overridding method
    public void eat(){
        System.out.println("Boy is eating");
    }

    public static void main(String[] args) {
        Boy obj=new Boy();
        //this will call the child class version of eat()
        obj .eat();
    }

}
