package Oracle;

public class Oracle30 {
    public static void main(String[] args) {
        String [] arr={"A","B","C","D"};
         /*
        for (String letter:arr){
            if (letter.equals ("C")){
                continue;
            }
            System.out.println (letter);
        }

          */

        for (int i=0;i<arr.length;i++){
            System.out.println (arr[i]+" ");
            if(arr[i].equals ("C")){
                continue;
            }
            System.out.println ("work done");
            break;

        }



    }
}
