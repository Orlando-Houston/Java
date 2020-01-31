package Udemy;

public class ArrayBreakStatement {
    public static void main(String[] args) {
        String[] animals={"Dog","Cat","Lizard","Bird","Snake"};
        for (String animal:animals){
            if (animal.equals ("Lizard")){
                break;
            }
            System.out.println (animal);
        }
    }
}
