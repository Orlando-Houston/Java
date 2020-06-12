package SubjectHeadings.Arrays.ArrayMyReview;

public class CarDecision {
    public static void main(String[] args) {
        String tested = "Yes";
        boolean mileage = true;
        boolean age = false;

        if(tested.equalsIgnoreCase("No")){
            System.out.println("Don't Buy");
        }
        else {
            if(mileage){
                System.out.println("Buy");
            }
            else{
                if(age){
                    System.out.println("Buy");
                }
                else{
                    System.out.println("Don't Buy");
                }
            }
        }

    }
}
