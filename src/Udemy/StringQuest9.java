package Udemy;

public class StringQuest9 {
    public static void main(String[] args) {
        int total=0;
        StringBuilder letters=new StringBuilder ("abcdefg");
        total+=letters.substring (1,2).length ();
        total+=letters.substring (6,6).length ();// empty
        total+=letters.substring (6,5).length ();//when starting next number is greater then
        System.out.println (total);
        //an exception is thrown

    }
}
