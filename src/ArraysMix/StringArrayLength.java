package ArraysMix;

public class StringArrayLength {
    public static void main(String[] args) {
        String[] a={"abc","defgh","qwerty","asd"};
        int counter=0;
        for(int i=0 ; i<a.length;i++){
            if(a[i].length()<4){
                counter++;
                System.out.println(a[i]);
            }
        }

        System.out.println(counter);
    }
}
