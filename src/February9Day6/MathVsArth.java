package February9Day6;

import java.util.Scanner;

public class MathVsArth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Math or Art? : ");
        String choice = scanner.next();

        if(choice.equalsIgnoreCase("math")){

            System.out.println("Tutor (y/n) : ");
            String tutor = scanner.next();
            if (tutor.equalsIgnoreCase("y")){
                System.out.println("OK");
            }
            else if (tutor.equalsIgnoreCase("n")){
                System.out.println("Study your self");
            }
            else {
                System.out.println("y or n please!!");
            }
        }
        else if (choice.equalsIgnoreCase("art")){
            System.out.println("Nice choice");
        }
        else {
            System.out.println("Only art or math");
        }
    }
}
