package SubjectHeadings.MethodFerhat.MethodFunction;

public class MethodOverloading1 {
    void kareKok(int x){

        x = x*x;
        System.out.println("Integer X: " + x);
    }

    void kareKok(double x){

        x = x*x;
        System.out.println("Double X: " + x);
    }


    public static void main(String[] args) {

        MethodOverloading1 over = new MethodOverloading1();
        over.kareKok(5);
        over.kareKok(2.87);

    }

}

