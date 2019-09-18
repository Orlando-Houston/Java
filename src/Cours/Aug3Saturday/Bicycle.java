package Cours.Aug3Saturday;
/*
Write a Bicycle SubjectHeadings.Class with properties and methods listed and create at least 1 Bicycle object than list all properties and methods in the main​
Properties​
Color​
Size​
Methods​
Go fast . (print )​
Go faster (print)​
Go slowly (print)​
Slow down (print)​
 */


public class Bicycle {
    int size;                                             //size attribute of the SubjectHeadings.Class
    String color;
    public Bicycle(int sizeBike, String colorBike){
        this.size = sizeBike; //parameter size assigned to SubjectHeadings.Class parameter size
        this.color = colorBike;
    }
    public Bicycle(){
        this.size=18; //SubjectHeadings.Class parameter initialed with 18
        this.color = "blue";
    }
    public void goFast(){
        System.out.println("Go fast");
    }
    public void goFaster(){
        System.out.println("Go faster");
    }
    public void goSlow(){
        System.out.println("Go slow");
    }
    public void slowDown(){
        System.out.println("Slow Down");
    }

}

