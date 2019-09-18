package InterviewQuestion;

public class CodingDay {
    public static int bestProfit(int[] data) {
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<data.length;i++){

            for (int j=i+1;j<data.length;j++){
                profit=data [j]-data [i];
                if(profit>maxProfit)
                    maxProfit=profit;
            }
        }
        return maxProfit;


    }


    public static void main(String[] args) {
    int[] data={9,11,2,5,7,10};
        System.out.println(bestProfit(data));



    }
}
