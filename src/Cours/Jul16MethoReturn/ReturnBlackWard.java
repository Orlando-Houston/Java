package Cours.Jul16MethoReturn;

public class ReturnBlackWard {
    public static String backWard(String inputString) {
        String reversed = "";//epmty container
                   //start                              end
        for (int i=inputString.length() - 1; i >= 0; i--) {
            reversed=reversed+inputString.charAt(i);
                             //concatanation bitistirme.birlestirme
        }
        return reversed;    //ters
    }
}
