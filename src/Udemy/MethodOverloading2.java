package Udemy;

public class MethodOverloading2 {
    public static void calculateTheScore(String name, int score) {

        System.out.println (name+" player"+score+"has points");

    }

    public static void calculateTheScore(int score) {
        System.out.println ("nameless player"+" "+score+" " +"has a point");

    }

    public static void calculateTheScore(String name) {
        System.out.println ("player named"+" " +name+" " +"dosnt have any  score ");


    }

    public static void main(String[] args) {
        calculateTheScore ("Zeynep",92);
        calculateTheScore (85);
        calculateTheScore ("Jan");
    }
}
