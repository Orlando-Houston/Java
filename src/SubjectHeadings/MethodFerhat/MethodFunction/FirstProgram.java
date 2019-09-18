package SubjectHeadings.MethodFerhat.MethodFunction;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {  //main in kendisi de method


        Scanner scan=new Scanner(System.in);
       call();   //we typed the method name directly
        typ();

    }
    public static void call(){  // methodun adi call ve herhangi bir parametre almiyor
        System.out.println("merhaba");
        System.out.println("nasilsin");
        int a=3;
        int multp=3*a;
        System.out.println("A:"+multp);
    }

    public static void typ(){
        int a=3;
        System.out.println("A:"+a);
    }
}
