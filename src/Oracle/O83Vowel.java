package Oracle;

public class O83Vowel {
    private char var;

    public static void main(String[] args) {
       // var1='a';
        char var1='a';
        char var2= var1;// assignment
        var2='e';

        System.out.println ("varr1="+ var1+" "+"var2="+var2);


        O83Vowel obj1=new O83Vowel ();
        O83Vowel obj2=obj1;
        obj1.var='i';
        obj2.var='o';
        System.out.println (obj1.var+" ,"+obj2.var);


    }
}
