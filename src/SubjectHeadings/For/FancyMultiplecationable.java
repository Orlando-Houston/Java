package SubjectHeadings.For;

public class FancyMultiplecationable {
    public static void main(String[] args) {
        System.out.println(" ");
        for (int k=1 ; k<10;k++){
            System.out.printf("%5d",k);
        }
        System.out.println();
        //  System.out.println("----------------------------------------------");
        for (int m=0;m<50;m++)
            System.out.println("-");

        for (int i=1 ;i<10;i++){
            System.out.println(i+"|");
            for (int j=1; j<=9;j++){
                System.out.printf("%5d",i*j);

            }
            System.out.println();

        }
    }
}

