package Cours.Aug10Review;

public class Bicycle3 {
    int size;
    String color;

    public Bicycle3(int size,String color){       //with parameter construction
        this.size=size;
        this.color=color;
    }

    public Bicycle3() {     //without parameter overloading constructor
        this.size=18;
        this.color="blue";

    }
    public void goFast(){
        System.out.println("Go fast");
    }
    public void goFaster(){
        System.out.println("Go Faster");

    }
    public void goSlow(){
        System.out.println("Go Slow");
    }
    public void slowDown(){
        System.out.println("Slow Down");

    }


}
