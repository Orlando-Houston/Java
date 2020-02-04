package Udemy;

public class ParameterizedMethods {

    public static void addition(int a,int b,int c) {
      //  System.out.println ("toplam"+(a+b+c));

    }

    public static void greeting(String name) {
        System.out.println ("Hello "+name);

    }

    public static void greetingSalutation(String greet,String name) {
        System.out.println (greet+name);



    }
    public static void main(String[] args) {
        greeting ("Time");
        greetingSalutation ("Hello","Selda");
        addition (2,4,6);

    }
}
