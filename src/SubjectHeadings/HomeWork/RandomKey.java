package SubjectHeadings.HomeWork;

import java.util.Random;

public class RandomKey {
    public static String generateSessionKey(int length){
        String alphabet =
                new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
        int n = alphabet.length(); //10

        String result = new String();
        Random r = new Random(); //11

        for (int i=0; i<length; i++) //12
            result = result + alphabet.charAt(r.nextInt(n)); //13

        return result;
    }

    public static void main(String[] args) {

        System.out.println(generateSessionKey(5));
    }
}
