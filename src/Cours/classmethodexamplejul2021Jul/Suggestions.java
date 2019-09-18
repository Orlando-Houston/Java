package Cours.classmethodexamplejul2021Jul;

public class Suggestions {

    public  void suggestFood() {
        double rand=Math.random()*3+1;
        if ((int)rand==1){
            System.out.println("Drink soup");
        }

         else if ((int)rand==2){
            System.out.println("Eat Hamburger");
        }
        else{
            System.out.println("");
        }
    }

    public  void suggestCloths() {
        double rand=Math.random()*3+1;
        if ((int)rand==1){
            System.out.println("Red Shirt");
        }

        else if ((int)rand==2){
            System.out.println("Blue Jacket");
        }
        else{
            System.out.println("White Hat ");//parentases can be leave empty
        }
    }

    }














