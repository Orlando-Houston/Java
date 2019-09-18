package SubjectHeadings.Reverse;

import Cours.Jul18ConsecativeReversed.StringReverse;

public class StringReservedTest {
    public static void main(String[] args) {

        System.out.println( Cours.Jul18ConsecativeReversed.StringReverse.isPalindrome("123"));


        String input="racecar";
        String reversedInput= StringReverse.reverseString(input);
        if (input.equals(reversedInput)){
            System.out.println("It is Palindrome");

        }
        else{
            System.out.println("not palindrome");

        }
    }
}


