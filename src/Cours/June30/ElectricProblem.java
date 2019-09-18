package Cours.June30;

public class ElectricProblem {
    public static  void  main (String[]args){
        int amountKw=800;
        double bill=0;

        if (amountKw>0 &&amountKw <=500){
            bill=amountKw* 0.3;

        }
        else if (amountKw>500&& amountKw<=1000){
            bill=amountKw*0.4;
        }
        else if(amountKw>1000&& amountKw<=2000){
            bill=amountKw *0.5;

        }
        else{
            bill=amountKw *0.8;
        }
        System.out.println("Your bill is:"+ bill);













    }
}
