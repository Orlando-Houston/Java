package SubjectHeadings.OddAndEvenNumber;

import java.util.Scanner;

public class Odd3 {
    public static void main(String[] args) {
        int[]myArray={1,2,3,4,5,6,7,8,9,};
        int counter=0;
        for (int i=0;i< myArray.length;i++){
            if (myArray[i]%2!=0) {
                counter = counter + 1;
            }
        }
        System.out.println(counter);


        //asking user
        Scanner scanner=new Scanner(System.in);
        int[] myArr=new int[5];

        for (int i=0; i<myArr.length;i++){
            System.out.print("enter number:");
            myArr[i]=scanner.nextInt();

        }


        int numberOfOdds=0;
        for (int i=0; i<myArr.length;i++){
            if (myArr[i]%2==1){
                numberOfOdds++;
            }
        }
        System.out.println("There are"+numberOfOdds +"odd numbers in your numbers");



    }
}


