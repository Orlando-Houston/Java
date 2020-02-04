package Oracle;

public class CarTurkConstructorMainMethod {
    public static void main(String[] args) {
        CarTurkCostructorMethod myCar=new CarTurkCostructorMethod ("DarkGreey","jeep",1.8,4);//it has problem
        myCar.showInfos ();
                                                                     //send off   launc  startup
        CarTurkCostructorMethod myCar2=new CarTurkCostructorMethod ();//initiating default value
         myCar2.showInfos ();

        CarTurkCostructorMethod myCar3=new CarTurkCostructorMethod ("Black","Jeep");
         myCar3.showInfos ();

    }

}
