package SubjectHeadings.MethodFerhat.MethodFunction;

public class MertOverloading {
    public static void main(String[] args) {
        System.out.println("2 Sayı Topla: "+topla(12,24));
        System.out.println("3 Sayı Topla: "+topla(12,24,36));
        System.out.println("4 Sayı Topla: "+topla(12,24,36,48));
    }

    public static int topla(int a, int b) {
        return a+b;
    }

    public static int topla(int a, int b, int c) {
        return a+b+c;
    }

    public static int topla(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
