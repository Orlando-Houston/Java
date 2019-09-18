package SubjectHeadings.MethodFerhat.MethodFunction;

import java.util.Scanner;

public class FirstProgram2 {
    public static void main(String[] args) {  //main in kendisi de method


        Scanner scan=new Scanner(System.in);
       call();   //we typed the method name directly
        //typ metoduna parametre verdigim zaman  buradaki paranteze bir deger vermem gerkiyor
        typ("Selda","caglayan");
        addition(3,4);




    }
    public static void call(){  // methodun adi call ve herhangi bir parametre almiyor
        System.out.println("merhaba");
        System.out.println("nasilsin");
        int a=3;
        int multp=3*a;
        System.out.println("A:"+multp);
    }

    public static void typ(String name,String lastName){


        System.out.println("merhaba " +name+" "+lastName+" .");
    }

    public static void addition(int a,int b) {
        int sum=a+b;
        System.out.println("Result:"+sum);

    }
}



