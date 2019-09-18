package SubjectHeadings.MethodFerhat.MethodFunction;
//icindeki bosluk sayisi,harf sayisi,tersten yazilisi,kelime sayisini bulan program

public class Sample1 {
    public static void main(String[] args) {

    }

    public static int word(String sentence) {
        int result=sentence.length();
        for (int i=0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                result--;
            }

        }
        return result;
    }

    public static int sentence(String sentence) {
        int number=1;
        for (int i=0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                number++;
            }
        }
        return number;
    }

}
