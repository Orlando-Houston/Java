package SubjectHeadings.HomeWork;

public class NumericPattern {
    public static void main(String[] args)
    {
        int count=0;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                count=count+1;
                System.out.print(count+"");
            }
            System.out.println();

        }

    }
}
