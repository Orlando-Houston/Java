package Cours.Jul9;

public class RevelsalyTriangle {
    public static void main(String[] args)
    {
        for (int i=1;i<=6;i++) // satir
        {
            for (int j=1;j<i;j++) //column
            {
                System.out.print(" ");

            }
            for (int k=6;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
