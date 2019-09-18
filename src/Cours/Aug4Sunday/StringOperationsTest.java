package Cours.Aug4Sunday;

public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations myStrNoParam = new StringOperations();
        System.out.println(myStrNoParam.reversed());
        StringOperations myStrParam = new StringOperations("JAVA");
        System.out.println(myStrParam.reversed());
        System.out.println(myStrNoParam.reversed("Test"));
        System.out.println(myStrParam.reversed("123"));
        //System.out.println("ABC".toLowerCase());
        System.out.println(myStrParam.makeOnlyFirstLetterUpper());
        char[] output = myStrNoParam.returnAsArray();
        for(char letter:output){
            System.out.println(letter);
        }
    }
}

