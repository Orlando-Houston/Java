package Cours.Aug6;

public class CipherDicipherTest {
    public static void main(String[] args) {
        CipherDicipher myWord = new CipherDicipher();

        String ciphered = myWord.cipher();
        System.out.println(ciphered);
        System.out.println(myWord.deCipher(ciphered));

        CipherDicipher myCipher = new CipherDicipher("Java is Fun",4);
        String ciphered2 = myCipher.cipher();
        System.out.println(ciphered2);
        System.out.println(myCipher.deCipher(ciphered));
    }

}

