package SubjectHeadings.StringClass;
// int to String using Integer.toString()

public class B {
    public static void main(String args[]) {
        int ivar = 111;
        String str = Integer.toString(ivar);
        System.out.println("String is: "+str);
        //output is: 555111 because the str is a string
        //and the + would concatenate the 555 and str
        System.out.println(555+str);

        //output is: 666 because ivar is int value and the
        //+ would perform the addition of 555 and ivar
        System.out.println(555+ivar);
    }
}
