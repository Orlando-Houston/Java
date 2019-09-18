package SubjectHeadings.Arrays.CommonArray;


    import java.util.Scanner;
    public class TryCatch {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int s1,s2,s3;
            System.out.print("Bölüm'ü giriniz:");
            s1=input.nextInt();
            System.out.print("Bölen'i giriniz:");
            s2=input.nextInt();
            try {
                s3=s1/s2;
                System.out.println("Sonuc:"+s3);
            }
            catch(Exception e)
            {
                System.out.println("Karşılaştığımız hata: "+e);
            }
        }
    }

