package Cours.Jul2Swıch;

public class SwitchCase {
    public static void main(String[] args) {
        //Secilen ay degeri
        int ayDegeri=9;
        //Yazdirilacak ayDegeri
        String ayDegeriStr=null;

        //switch= case ile hangi ayin hangi sayiya denk geldi[inin belirtildigi bolum
        switch (ayDegeri){
            case 1:
                ayDegeriStr="Ocak";
                break;
            case 2:
                ayDegeriStr="subat";
                break;
            case 3:
                ayDegeriStr="Mart";
                break;
            case 4:
                ayDegeriStr="Nisan";
                break;
            case 5:
                ayDegeriStr="Mayis";
                break;
            case 6:
                ayDegeriStr="Haziran";
                break;
            case 7:
                ayDegeriStr="Temmuz";
                break;
            case 8:
                ayDegeriStr="Agustos";
                break;
            case 9:
                ayDegeriStr="Eylul";
                break;
            case 10:
                ayDegeriStr="Ekim";
                break;
            case 11:
                ayDegeriStr="Kasim";
                break;
                case 12:
                    ayDegeriStr="aralik";
                    break;
            default:
                System.out.println("Invalid");
                break;


        }
        System.out.println("Secilen ay degeri"+ayDegeriStr);

    }
}


