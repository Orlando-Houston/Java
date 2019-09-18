package Cours.Jul18ConsecativeReversed;

public class StringReverse {


    public static String isPalindrome(String word) {
        String answer="";
        String reverseWord="";
        for (int i=word.length()-1;i>=0;i--){
            reverseWord=reverseWord+word.charAt(i);
        }
        if (reverseWord.equals(word)){
            answer="Yes palindrome";
        }
        else{
            answer="No not a Palindome";
        }
        return answer;
    }
    //End of isPalindrome method
    //this method returns reversed(backward) version of the original  string

    public static String  reverseString(String inputString) {
        String reversed="";
        for (int i=inputString.length()-1;i>=0;i--){
            reversed=reversed+inputString.charAt(i);
        }
        return reversed;

    }

}