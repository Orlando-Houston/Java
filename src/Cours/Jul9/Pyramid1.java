package Cours.Jul9;

public class Pyramid1 {
    public static void main(String[] args)
    {
        for (int i=1;i<=11;i++){

            for ( int j=11;j>=i;j--){
                System.out.print("0");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }



          for (int l=2;l<=i;l++)
            {
               System.out.print("s");

            }
            System.out.println();

        }

    }
}
