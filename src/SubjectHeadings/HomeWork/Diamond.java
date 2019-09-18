package SubjectHeadings.HomeWork;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("Enter number of lines (Odd number)");

        Scanner sc=new Scanner(System.in);

        int lines=sc.nextInt();
        int mid=(lines+1)/2;
        //upper
        for (int i=1;i<=mid; i++){
            //space
            for (int s=1; s<=(mid-i); s++){
                System.out.print(" ");
            }

            //star
            for (int j=1;j<=(i*2-1);j++){
                System.out.print("*");

            }
            System.out.println();


        }
        //lower
        for (int i=1;i<=(mid-1);i++){
            //space
            for (int s=1;s<=i;s++){
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=2*(mid-i)-1;j++){
                System.out.print("*");

            }
            System.out.println();


    }
}
}


