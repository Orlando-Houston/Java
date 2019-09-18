package SubjectHeadings.MethodFerhat.MethodFunction;

public class DortIslem {
    public void Toplama(int a, int b){

        int c = a+b;
        System.out.println("a+b = " +c);

    }

    public void Cikarma(int a, int b){

        int c = a-b;
        System.out.println("a-b = " +c);

    }

    public void Carpma(int a, int b){

        int c = a*b;
        System.out.println("a*b = " +c);

    }

    public void Bolme(int a, int b){

        int c = a/b;
        System.out.println("a/b = " +c);
    }




    public static void main(String[] args) {

        DortIslem islem = new DortIslem();

        islem.Toplama(10, 5);
        islem.Cikarma(8, 7);
        islem.Carpma(3, 5);
        islem.Bolme(100, 10);

    }
}

