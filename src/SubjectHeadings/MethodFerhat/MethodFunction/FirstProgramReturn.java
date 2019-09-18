package SubjectHeadings.MethodFerhat.MethodFunction;

import java.util.Scanner;

public class FirstProgramReturn {
    public static void main(String[] args) {  //main in kendisi de method


        Scanner scan=new Scanner(System.in);
        call();   //we typed the method name directly
        //typ metoduna parametre verdigim zaman  buradaki paranteze bir deger vermem gerkiyor
        typ("Selda","caglayan");

        int result=sum(3,4);
        result=result*2;
        System.out.println("multp:"+result);



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

    public static int  sum(int a,int b) {  //bu metodda return yapacagiz
        int total=a+b;
        return total;

    }
}




