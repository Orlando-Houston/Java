package SubjectHeadings.Reverse;

public class Palindrome {
    public static void main(String[] args) {
        String word = "test";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
        String newWord = "madam";
        String reversedNewWord = returnReverse(newWord);//son uygulama
        if (newWord.equals(reversedNewWord)) {
            System.out.println(newWord+"isPalindrome");
        }
        else {
            System.out.println(newWord + "is not palindrome");
        }
        System.out.println(isPalindrome("kayak"));

    }

    public static String returnReverse(String word) {
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        return reversedWord;
    }

    public static String isPalindrome(String original) {
        String result = "";
        String reversedOriginal = ""; //this is for comparison
        for (int i = original.length() - 1; i >= 0; i--) {
            reversedOriginal = reversedOriginal + original.charAt(i);
        }
        if (original.equals(reversedOriginal)) {
            result = "yes Palindrome";
        } else {
            result = "Not palindrome";
        }
        return result;
    }
}




