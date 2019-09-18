package SubjectHeadings.MethodFerhat;

public class NonParameterReturnValue {
    public static void main(String[] args) {
        int d=add();
        System.out.println("Sonucunuz:"+d);


        double result=multiplication();
        System.out.println("Multiplication:"+result);

    }

    public static int  add() {  //hangi turde sonuc bekliyorsak void yerine onu giriyoruz.metodun adini yaziyoruz

        int a=10;
        int b=5;
        int total=a+b;
        return total;


    }

    public static double multiplication () {

        int a=5;
        double b=2.7;
        return a*b;    //bu sekildede yazilabilir


    }
}
