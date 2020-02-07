package Oracle;

public class OracleArray62 {
    public static void main(String[] args) {
        int[] intArray={1,3,5,7,9};

        for (int i=0;i<intArray.length;i++){
            System.out.print (intArray[i]+" "); //it is work
        }



        for (int i:intArray){
            System.out.print (i+" ");//it is work
        }


    }
}
