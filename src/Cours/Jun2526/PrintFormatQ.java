package Cours.Jun2526;

public class PrintFormatQ {
    public static void main(String[] args) {
        String opinion="Java is cool";
        System.out.printf("Do you think %s",opinion);
        System.out.println("Do you think"+opinion);
        /*

        String stringSample1="Hello";
        String stringSample2="World";

        System.out.println(stringSample1+" "+stringSample2);

         */
        float percentage=78.98f;
        System.out.printf("yes %.2f of people think it is fun",percentage);//%%%f yazilirsa yuzdeyi verir.
    }
}
