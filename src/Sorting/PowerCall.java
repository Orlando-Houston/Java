package Sorting;

public class PowerCall {
    public static void main(String[] args) {
        System.out.println(powerCalc(2,40));
    }
    public static long powerCalc(int base,int n){
        if(n==0){
            return 1;
        }
        else {
            return base * powerCalc(base,n-1);
        }
    }
}
