package SubjectHeadings.Reverse;

public class ReversString {
    public static void main(String[] args) {
        String word="sabire";
        String reverse="";
        for (int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);
    }
}
