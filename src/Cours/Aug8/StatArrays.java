package Cours.Aug8;



public class StatArrays extends ArrayOverLoding {
    public double returnAverage(int[]array){

        int sum=0;
        double average;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i];

        }
        average=sum/array.length;
        return average;
    }
    public  int returnmax(int[]array){
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public int returnMin(int[]array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;

    }
}
