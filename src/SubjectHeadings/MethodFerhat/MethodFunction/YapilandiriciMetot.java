package SubjectHeadings.MethodFerhat.MethodFunction;

public class YapilandiriciMetot {
    int ycap;
    double cevre;
    double alan;
    final static double pi = 3.14;

    void bilgileriYaz(YapilandiriciMetot d) {
        System.out.println("Dairenin Yarıçapı   : " + d.ycap);
        System.out.println("Dairenin Alanı      : " + d.alan);
        System.out.println("Dairenin Cevresi    : " + d.cevre);
        System.out.println();
    }

    public YapilandiriciMetot(int r) {
        ycap = r;
        alan = pi * r * r;
        cevre = 2 * pi * r;
    }

    public static void main(String args[]) {

        YapilandiriciMetot d1 = new YapilandiriciMetot(3);
        d1.bilgileriYaz(d1);
        YapilandiriciMetot d2 = new YapilandiriciMetot(11);
        d1.bilgileriYaz(d2);
    }
}

