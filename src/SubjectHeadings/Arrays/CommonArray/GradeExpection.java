package SubjectHeadings.Arrays.CommonArray;

import java.util.Scanner;

public class GradeExpection {
    public static void main(String[] args) {
            Scanner sınav=new Scanner(System.in);
            System.out.print("Sınav notunuzu giriniz: ");
            try {
                int not=sınav.nextInt();
            }
            catch(Exception e){
                System.out.println("Dikkat!Programın hatası: " + e);
            }
            finally {
                System.out.println("Lütfen sadece 0 ile 100 arasında bir not giriniz.");
            }
        }
    }

