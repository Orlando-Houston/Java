package SubjectHeadings.StringClass;

public class HowManyA {
    public static int pick(String word) {
        char letter='a';
        int number=0;
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)==letter){
                number++;
            }
        }
        return number;

    }

    public static void main(String[] args) {
        System.out.println(pick("Arabami almaya geldim"));
    }
}
