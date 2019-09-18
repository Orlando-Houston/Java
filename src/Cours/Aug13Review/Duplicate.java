package Cours.Aug13Review;


public class Duplicate {
    public static void main(String[] args) {
        String[]arrayString={"A","B","C","D","B","A"};//this part after typed
        removeDuplicateStrings(arrayString);


    }
    public static void removeDuplicateStrings(String[] array){
        for(int i=0 ; i<array.length ; i++){
            for(int j=i ; j<array.length ; j++){
                if(array[i].equals(array[j])&& i!=j){
                    System.out.println(array[i]);
                }
            }
        }
    }


}
