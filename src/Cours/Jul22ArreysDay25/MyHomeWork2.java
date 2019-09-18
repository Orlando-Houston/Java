package Cours.Jul22ArreysDay25;

public class MyHomeWork2 {
    public static void main(String[] args) {
        String[] myStringArray = {"qwe", "ab", "asdf", "zxcvb", "abc", "asdfghjk"};
        int numberOfElements=0;
        String word="";
        for (int i=0;i<myStringArray.length;i++){
            word=myStringArray[i];
            if (word.length()<3){
                numberOfElements++;

            }
        }
        System.out.println("There"+numberOfElements+"Strings");
    }
}
