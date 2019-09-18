package SubjectHeadings.StringClass;

public class StringMethod {
    public static void main(String[] args) {

        String nameLastname="Altun Keskin";
        char c=nameLastname.charAt(6);
        System.out.println(c);


       int i= nameLastname.indexOf("n");
        System.out.println(i);

       String dL= nameLastname.toLowerCase();
        System.out.println(dL);

        String dU=nameLastname.toUpperCase();
        System.out.println(dU);

       String s= nameLastname.replace("a","e");
        System.out.println(s);

        char[]slag=nameLastname.toCharArray();
        for (char c1:slag){
            System.out.println(c1);

        }




    }
}
