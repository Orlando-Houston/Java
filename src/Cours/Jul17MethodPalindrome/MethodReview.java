package Cours.Jul17MethodPalindrome;

public class MethodReview {
    public static void main(String[] args) {
        System.out.println("Coskun");
        PrintName();
        PrintMyNameParameter("X");//void parameter
        System.out.println(printMyNameString());



    }

    public static void PrintName() {
        System.out.println("Coskun");// withoutparameter

    }
    //void method with..parameter
    public static void PrintMyNameParameter(String name) {
        System.out.println(name);

        //String  method without parameter
    }

    public static String printMyNameString() {
        String returnname="Coskun(string without parameter)";
        return returnname;

    }

    public static String printMyNameStringParameter(String name) {
        return name;

    }

}
