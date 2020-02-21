package Udemy;

public class PassingDataSringBuilder {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder ();

        build (sb);
        System.out.println ("String Builder"+sb);

    }
    public static void build(StringBuilder s){

        s.append ("Tom");

    }

}
