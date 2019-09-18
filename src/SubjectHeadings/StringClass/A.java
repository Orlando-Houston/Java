package SubjectHeadings.StringClass;
// int to String using String.valueOf()

public class A {
    public static void main(String args[]) {
        int ivar = 111;
        String str = String.valueOf(ivar);
        System.out.println("String is: "+str);
        //output is: 555111 because the str is a string
        //and the + would concatenate the 555 and str
        System.out.println(555+str);
    }
}
