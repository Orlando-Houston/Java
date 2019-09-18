package Cours.Jul18ConsecativeReversed;

public class StringReverseTest {
    public static void main(String[] args) {

        System.out.println( StringReverse.isPalindrome("123"));


        String input="racecar";
        String reversedInput=StringReverse.reverseString(input);
        if (input.equals(reversedInput)){
            System.out.println("It is Palindrome");

            }
            else{
            System.out.println("not palindrome");

        }
    }
}
