package SubjectHeadings.MethodFerhat.MethodFunction;

public class ReturnDeger {
    public static double DonenDeger() {

        int sonuc = 0;

        for(int i=0; i<100; i++)
            sonuc = sonuc +i;

        return sonuc;

    }

    public static void main(String[] args) {

        System.out.println(DonenDeger());
    }
}

