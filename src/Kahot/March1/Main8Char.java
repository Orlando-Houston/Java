package Kahot.March1;

public class Main8Char {
    public static void main(String[] args) {
        a ("Hello");

    }
    static void a(String a){
        String b=a.toLowerCase ();
        for (byte i=0;i<a.length ();i++){
            char x=b.charAt (i);
            x++;
            System.out.println (x);
        }
    }
}
