package SubjectHeadings.MethodFerhat;

import java.util.Scanner;

public class
NonParameterReturnValue2{
    public static void main(String[] args) {
        String incoming=nameLastName();
        System.out.println("Welcome:"+incoming);

    }

    public static String nameLastName() {
        Scanner personalInformationTake=new Scanner(System.in);
        String name;
        String lastname;
        System.out.print("please Enter your name: ");
        name=personalInformationTake.next();
        System.out.println("Please Enter your Lastname: ");
        lastname=personalInformationTake.next();

        return name+" "+lastname;



    }
}
