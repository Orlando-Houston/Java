package Interface;

public interface Animals {
    public void eat ();
    public void travel();
}
class Mammal implements Animals {
    public void eat() {
        System.out.println ("mammals eats");
    }

    public void travel() {
        System.out.println ("mammal travel");
    }
    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        Mammal mammal=new Mammal ();
        mammal.eat ();
        mammal.travel ();
    }
}