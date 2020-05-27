package ArraysMix;

public class ArraySplitting {
    public static void main(String[] args) {
        int myArray[]={1,2,3,4,5,6,7,8,9};
        int arrayalen=myArray.length;
        //to find in the middle
        int half=arrayalen/2+1;
       // System.out.println (half);
        int[]firstHalf=new int[half];
        for ( int i=0;i<half;i++){
            firstHalf[i]=myArray[i];

        }
        /*
        System.out.println (firstHalf[0]);
        System.out.println (firstHalf[1]);
        System.out.println (firstHalf[2]);
        System.out.println (firstHalf[3]);
        System.out.println (firstHalf[4]);

         */
        int secondHalf[]=new int[myArray.length-half];
        int index=0;
      //  for (int i=0; i<)
        for (int i=half;i<myArray.length;i++){
            secondHalf[index]=myArray[i];
            index++;
        }
        System.out.println ("First Half");
        for (int i=0;i<secondHalf.length;i++){
            System.out.println (firstHalf[i]);
        }
        System.out.println ("Second Half");
        for (int i=0;i<secondHalf.length;i++){
            System.out.println (secondHalf[i]);
        }

}
}
