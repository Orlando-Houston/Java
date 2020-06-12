package SubjectHeadings.Arrays.ArrayMyReview;

public class IdControl {
    public static void main(String[] args) {
        boolean idRegular=false;
        boolean ITid=false;
        if(idRegular || ITid){
            System.out.println("Welcome to Building");
            if(ITid){
                System.out.println("Welcome to IT Room");
            }
            else{
                System.out.println("You can not enter IT Room");
            }
        }
        else {
            System.out.println("You can not enter building");
        }

    }
}
