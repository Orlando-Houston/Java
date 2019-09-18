package SubjectHeadings.Arrays.CommonArray;


    import java.util.Scanner;
public class TryCatchFinaly {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vize notunu giriniz:");
        try {
            int vize = input.nextInt();
        } catch (Exception e) {
            System.out.println("Karşılaştığımız hata: " + e);
        } finally {
            System.out.println("Yanlız 0-100 arasında bir not giriniz.");
        }

    }}


