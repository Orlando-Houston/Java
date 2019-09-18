package SubjectHeadings.Arrays.ArrayMyReview;

public class ToString {
    public static void ttoString(int inputNumber){
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        String [] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String inputString = "";
        inputString = inputString + inputNumber;
        for(int i = 0; i < inputString.length();i++){
            for(int j = 0; j < numbers.length;j++){
                if(inputString.charAt(i) == numbers[j])
                    System.out.print(words[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        ttoString(156);
    }
}

