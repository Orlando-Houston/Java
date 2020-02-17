package Udemy;

public class StringImmutability {
    public static void main(String[] args) {
        String hello="hello";
        System.out.println (hello);


        String hi=hello+"world";//hi="helloworld"
        System.out.println (hi);

        hi=hello;//hi="hello"
        System.out.println (hi);

        System.out.println (hi+hello);//hellohello without space
       // hello.toUpperCase ();//it doestnt change..because string immatuble
        hello= hello.toUpperCase ();//writen as new string changing referance

        System.out.println (hello);

        //concat
        String s1="1";
        String s2=s1.concat ("2");//12
        s2.concat ("3");//

        System.out.println (s1);//1
        System.out.println (s2);//12

        s2=s2.concat ("3");
        System.out.println (s2);


        String ta="A";
        ta=ta.concat ("B ");
        System.out.println (ta);

        String tb="C ";
        ta=ta.concat (tb);
        System.out.println (ta);

        ta.replace ('C','D');


        ta=ta.concat (tb);
        System.out.println (ta);
    }
}
