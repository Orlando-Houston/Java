package ArraysMix;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arrayInt= {1,2,3,4,5,5,6,7,8,9};
        String arrayString[] = {"Hello , Hi","Java","It","is","good", "to", "see", "you"};

        for(int number:arrayInt){
            System.out.println(number);
        }
        for(String word:arrayString){
            System.out.println(word);
        }
        int a=(1>3)? 3+4:6+9;
    }
}
