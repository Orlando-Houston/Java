package SubjectHeadings.MethodFerhat;

public class ParameterNonReturnValue {
    public static void main(String[] args) {
        add(10,15,20,1.2);/////second  add ler cikinca istedigimiz sayi ile dolduruyoruz.
        add(100,5,9,4);
        add(75,3,5,2);
        multif(23,7);
        multif(8,3);

    }


    public static void add(int a,int b,int c,double d) {   //first burayi yapiyoruz..

        int total = a + b+c;

        System.out.println("Total:" + total);

    }

    public static void multif(int a,int b) {
        int mult=a*b;
        System.out.println("multif:"+mult);

    }
}



