package Cours.Jul6ForAndWhile;

public class MultiplicationtableWithFor {
    public static void main(String[] args) {
        //multiplication table
        for (int i=1; i< 11;i++){
            for (int j=1; j<=10;j++){
                System.out.println(i+"X"+j+" ="+i*j);
                if ((j==10)){
                    System.out.println();
                }

            }
        }
    }
}
