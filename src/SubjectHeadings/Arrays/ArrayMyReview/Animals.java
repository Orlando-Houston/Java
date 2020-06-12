package SubjectHeadings.Arrays.ArrayMyReview;

public class Animals {
    public static void main(String[] args) {
        String breathe="Yes";
        String layEggs="No";

        String myAnimal="";

        if(!(breathe.equalsIgnoreCase("No"))){
            if(layEggs.equalsIgnoreCase("Yes")){
                myAnimal="Bird";
            }
            else{
                myAnimal="Mammal";
            }
        }
        else{
            myAnimal="Fish";
        }
        System.out.println(myAnimal);
    }
}
