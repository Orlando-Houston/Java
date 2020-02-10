package Oracle;

public class O4ConvertString {
    public static void main(String[] args) {
        Short s1=200;    //class
        Integer s2=400; //class
        Long s3=(long)s1+s2;  //class
      //  String 4=(String)(s3*s2);//compiler error  question  is this
        String s4 = String.valueOf (s3*s2);
        System.out.println (s4);

    }
}
