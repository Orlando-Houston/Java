package SubjectHeadings.Arrays.ArrayMyReview;

public class LengthCheck {

 public static void main(String[] args) {
    String[] myStringArray = {"asdfg", "wer", "zxcvbn", "hjk"};
    int numberOfElements = 0;
    String word = "";
    for (int i = 0; i < myStringArray.length; i++) {
        word = myStringArray[i];
        if (word.length() < 4) {
            System.out.println(myStringArray[i]);

        }

    }

}}
