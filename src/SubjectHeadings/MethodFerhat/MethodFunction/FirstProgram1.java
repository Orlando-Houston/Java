package SubjectHeadings.MethodFerhat.MethodFunction;
//ilk run yaptigimizda  class taki ayi gormuyor.
//biz maindeki a yi yoruma aliyoruz

import java.util.Scanner;

public class FirstProgram1 {

   static int a=7;       //buradaki( a)  yi static yapmamiz gerekiyor.static maine cagiriyoruz


    public static void main(String[] args) {  //main in kendisi de method
       // int a=5;
        System.out.println("A:"+a);


        Scanner scan=new Scanner(System.in);
       // call();   //we typed the method name directly
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

