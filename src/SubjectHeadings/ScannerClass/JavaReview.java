package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class
JavaReview {
    public static void main(String[] args) {

            Scanner conv=new Scanner(System.in);
            System.out.println("T? W? D?");
            String answer=conv.next();
            if (answer.equalsIgnoreCase("T")) {
                System.out.println("C? F?");
                String temp=conv.next();

                if (temp.equalsIgnoreCase("C")){
                    System.out.println("From C to F");

                }
                else {
                    System.out.println("From F to C");

                }
            }
            else if (answer.equalsIgnoreCase("w")) {
                System.out.println("g?l?");
                String weight= conv.next();
                if (weight.equalsIgnoreCase("g")){
                    System.out.println("From g to l");

                }
                else {
                    System.out.println("From l to g");

                }

            }
            else {
                System.out.println("km? mi?");
                String dist=conv.next();

                if (dist.equalsIgnoreCase("km ")){
                    System.out.println("km to mi");

                }
                else{
                    System.out.println("mi to km");

                }
            }
        }
    }




