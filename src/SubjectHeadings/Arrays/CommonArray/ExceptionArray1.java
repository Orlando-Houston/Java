package SubjectHeadings.Arrays.CommonArray;

public class ExceptionArray1 {
    public static void main(String[] args){
        int sayı[] = {10,20,30,40,50,60};

        for (int s=0 ; s < 7 ; s++) {
            try {
                System.out.println("Sayı: " + sayı[s]);
            }
            catch(Exception e){
                System.out.println("Hata bulundu" + e);
            }
            System.out.println("Program bitti");
        }
    }
}
