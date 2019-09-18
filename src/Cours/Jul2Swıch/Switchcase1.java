package Cours.Jul2Swıch;

public class Switchcase1 {
    public static void main(String[] args) {
        String ayDegeriStr="Temmuz";
                int ayDeger=7 ;
                switch (ayDegeriStr.toLowerCase()){
                    case"ocak":
                        ayDeger=1;
                        break;
                    case"Subat":
                        ayDeger=2;
                        break;
                    case"Mart":
                        ayDeger=3;
                        break;
                    case"Nisan":
                        ayDeger=4;
                        break;
                    case"Mayis":
                        ayDeger=5;
                        break;
                    case"Haziran":
                        ayDeger=6;
                        break;
                    case"Temmuz":
                        ayDeger=7;
                        break;
                    case"Agustos":
                        ayDeger=8;
                        break;
                    case"Eylul":
                        ayDeger=9;
                        break;
                    case"Ekim":
                        ayDeger=10;
                        break;
                    case"Kasim":
                        ayDeger=11;
                        break;
                    case"Aralik":
                        ayDeger=12;
                        break;
                    default:
                        break;




                }
                System.out.println(ayDegeriStr+"ayi yilin"+ayDeger+".ayidir");

    }
}
