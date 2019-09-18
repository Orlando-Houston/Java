package SubjectHeadings.Reverse;

public class StringReversReturnWithParameter {
    public static String myRevers(String word) {
         String reverse="";
         for (int i=word.length()-1;i>=0;i--){
             reverse+=word.charAt(i);
         }
         return reverse;
    }

    public static void main(String[] args) {
        System.out.println(myRevers("Hoca efendi"));

    }
}
