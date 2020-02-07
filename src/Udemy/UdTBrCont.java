package Udemy;

public class UdTBrCont {
    public static void main(String[] args) {
        /*
        String[] letter={"a","b","c","d","e"};
        for (int i=0;i<letter.length;i++){
            System.out.print (letter[i]);
            if (letter[i].equals ("b")){
                break;
            }
        }

         */
        for (int i=0;i<10;i++){

            if (i==3||i==5){
                continue;
            }
            System.out.println ("i="+i);
        }
        for (int i=0;i<10;i++){
            System.out.println (i);
        }
    }
}
