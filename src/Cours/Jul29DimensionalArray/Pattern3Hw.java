package Cours.Jul29DimensionalArray;

public class Pattern3Hw {
    public static void main(String[] args) {
        for (int i=1 ; i<7 ; i++){
            for(int j=1 ; j<6 ; j++){
                System.out.print("*0 ");
            }
            System.out.println();
        }

        for(int i=1 ; i<7 ; i++){
            for(int j=1 ; j<7 ; j++){
                if(i%2!=0){
                    System.out.print("* ");
                }
                else System.out.print("0*");
            }
            System.out.println();
        }
    }
}
