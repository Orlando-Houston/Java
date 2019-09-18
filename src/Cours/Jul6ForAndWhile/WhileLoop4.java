package Cours.Jul6ForAndWhile;

public class WhileLoop4 {
    public static void main(String[] args) {
        int counter=0;
        while (counter<10){
            System.out.println(counter);
            counter++;
        }
        int counter1=100  ;
        while (counter1>0){
            System.out.println( counter1+" bottles of water on the wall.");
            counter1=counter1-1;   //decrease by one
        };

    }
}
