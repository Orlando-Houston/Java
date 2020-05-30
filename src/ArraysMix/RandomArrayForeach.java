package ArraysMix;

public class RandomArrayForeach {
    public static void main(String[] args) {

        int[] arrayNumbers= new int[10];
        for(int i=0 ; i<arrayNumbers.length;i++){
            arrayNumbers[i]=(int)(Math.random()*1000);
        }
        for(int number:arrayNumbers){
            System.out.println(number);
        }
        //System.out.println(generateRandomWord());

        String[] arrayString = new String[20];
        for(int i=0 ; i<arrayString.length;i++){
            arrayString[i]=generateRandomWord();
        }
        for(String word:arrayString){
            System.out.println(word);
        }
}
    public static String generateRandomWord(){
        String word="";
        int wordLength= (int)(Math.random()*6+1);
        for(int i=0 ; i<wordLength;i++){
            word+=(char)((int)(Math.random()*26+97));
        }
        return word;
    }


}
