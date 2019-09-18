package Cours.Jul6ForAndWhile;

public class whileLoop6 {
    public static void main(String[] args) {
        //A1 A2 A3.....A9
        //B1 B2 B3.....9
        char letter= 'A';
        while (letter <'M'){
            int number=1;
            while (number<10){
                System.out.println((char) letter+Integer.toString(number) );
                number+=1;
            }
            System.out.println("");
            letter+=1;
        };



    }
}
