package Cours.Aug12Review;

public class CapitalLetters {
    public static void main(String[] args) {
        System.out.println(findCapitalLetters("aasFDdfSDFgsFsdfgDGDGdfgdfgsd"));
    }
    public static int findCapitalLetters(String input){
        int numberOfCapitalLetters=0;
        for(int i=0 ; i< input.length(); i++){
            if(input.charAt(i)>64 && input.charAt(i)<91){
                numberOfCapitalLetters++;
            }
        }
        return numberOfCapitalLetters;
    }
}

