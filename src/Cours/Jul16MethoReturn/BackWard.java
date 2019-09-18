package Cours.Jul16MethoReturn;

public class BackWard {
    public static void backWard(String inputString) {
        String reversed="";
        for (int i=inputString.length()-1;i>=0;i--){
            System.out.println(inputString.charAt(i));
        }
    }

    public static void main(String[] args) {

    }

}
