package SubjectHeadings.Reverse;

public class StringReverseReturn {
    public static String myReverse() {
        String word="anne";
        String reverse="";
        for (int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(myReverse());
    }
}
