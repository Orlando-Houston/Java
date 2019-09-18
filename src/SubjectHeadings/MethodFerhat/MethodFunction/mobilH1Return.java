package SubjectHeadings.MethodFerhat.MethodFunction;

public class mobilH1Return {


        public static int toplama(int sayi1, int sayi2) {
            int sonuc = sayi1 + sayi2;
            return sonuc;
        }

        public static int cikarma(int sayi1, int sayi2) {
            int sonuc = sayi1 - sayi2;
            return sonuc;
        }

        //eger cikarma isleminde negatif deger cikmasini istemiyorsak
        public static int cikarma2(int sayi1, int sayi2) {
            if(sayi1 > sayi2) {
                int sonuc = sayi1 - sayi2;
                return sonuc;
            } else {
                System.out.println(sayi1 + " küçüktür " + sayi2);
                int sonuc = sayi2 - sayi1;
                return sonuc;
            }
        }

        public static int carpma(int sayi1, int sayi2) {
            int sonuc = sayi1 * sayi2;
            return sonuc;
        }

        public static int bolme(int sayi1, int sayi2) {
            int sonuc = sayi1 / sayi2;
            return sonuc;
        }

        public static void main(String[] args) {
            System.out.println("Toplama");
            System.out.println("5 + 6 = " + toplama(5, 6));
            System.out.println("Çıkarma");
            System.out.println("10 - 2 = " + cikarma(10, 2));
            System.out.println("12 - 8 = " + cikarma2(8, 12));
            System.out.println("Çarpma");
            System.out.println("5 x 6 = " + carpma(5, 6));
            System.out.println("Bölme");
            System.out.println("10 / 2 = " + bolme(10, 2));
        }
    }

