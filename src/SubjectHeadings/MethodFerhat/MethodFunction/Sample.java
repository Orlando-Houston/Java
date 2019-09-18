package SubjectHeadings.MethodFerhat.MethodFunction;
//icerisinde kac tane  rakam oldugunu bulan program

public class Sample {
    public static int countDigital(String word) {
        int result=0;
        for (int i=0;i<word.length();i++){
            if (Character.isDigit(word.charAt(i))){
                result++;

            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDigital("1q2w3e45rt67y"));
    }
}
