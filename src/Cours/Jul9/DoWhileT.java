package Cours.Jul9;

public class DoWhileT {
    public static void main(String[] args) {
        String star="*";
        int count=0;
        do{
            System.out.println(star);
            star=star+"*";

            count++;
        }while (count<4);
    }
}
