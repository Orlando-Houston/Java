package Cours.Jul20Random;

public class RandomExamples {
    public static int createRandomPassword() {
        double randomNumber=Math.random()*10+10;//or(1000000-100000)+100000;

        int result=(int)randomNumber;
        return  result;
    }

    public static String creatRandomPassString() {
        String password="";
        double rand;
        for (int i=1;i<7;i++){
            rand=Math.random()*10;

            int randInt=(int) rand;

            password=password+rand;

        }
        return password;

    }
}
