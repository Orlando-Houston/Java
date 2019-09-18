package SubjectHeadings.IfFerhat;

public class IfOnly {
    public static void main(String[] args) {
        int deger1 = 2;
        int deger2 = 4;
        String strDeger1 = "bootcamp";
        String strDeger2 = "nau";

        if((deger1 < deger2) && (strDeger1.contains(strDeger2))) {
            System.out.println(deger1 + " küçüktür " + deger2
                    + " ve " + strDeger1 + " " + strDeger2 + " String degerini icermektedir.");
        }

        if((deger1 == deger2) || (strDeger1.contains(strDeger2))) {
            System.out.println(deger1 + " eşittir " + deger2
                    + " veya " + strDeger1 + " " + strDeger2 + " String degerini icermektedir.");
        }

        if((deger1 < deger2) || (strDeger1.equals(strDeger2))) {
            System.out.println(deger1 + " küçüktür " + deger2
                    + " veya " + strDeger1 + " " + strDeger2 + " String degerini icermektedir.");
        }

        int deger3 = 23;

        //deger3 23'e esitse deger4'un degerini 24 yap degilse 22 yap
        int deger4 = (deger3 == 23) ? 24 : 22;
        System.out.println("deger4: " + deger4);

        //deger3 22'ye esitse deger4'un degerini 24 yap degilse 22 yap
        deger4 = (deger3 == 22) ? 24 : 22;
        System.out.println("deger4: " + deger4);

    }
}





