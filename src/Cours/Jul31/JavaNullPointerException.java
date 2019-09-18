package Cours.Jul31;

public class JavaNullPointerException {
    public static void main(String[] args) {
        printNextLetters(null);
    }
    public static void printNextLetters(String input){
        char letter;
        try {
            for (int i = 0; i < input.length(); i++) {
                letter = input.charAt(i);
                letter++;
                System.out.print(letter);
            }
        }
        catch (NullPointerException e){
            System.out.println("I can not do this for null");
        }
        System.out.println("Codes continue");
    }
}

