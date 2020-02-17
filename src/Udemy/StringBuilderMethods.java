package Udemy;

public class StringBuilderMethods {
    public static void main(String[] args) {
        //charAt,indexOf,length,substring
        //0 1 2 3 4 5 6 7 8 9 10
        //p r o g r a m m i n g
        StringBuilder sb=new StringBuilder ("programming");
        //gram
        String sub=sb.substring (sb.indexOf ("g"),sb.indexOf ("mi"));//important not building just string

        int len=sb.length ();//11
        char ch=sb.charAt (5);//a
        System.out.println (sub+" "+len+" "+ch);

        //append
        StringBuilder b=new StringBuilder ().append (1).append ("L");
        b.append ("-").append (true);
        System.out.println (b);

        StringBuilder builder=new StringBuilder ("programming");
        builder.insert (7,"-");
        builder.insert (2,2);
        System.out.println (builder);

        //delete,deleteCharAt
        builder.delete (4,9); // from to
        builder.deleteCharAt (2);//just
        System.out.println (builder);

       // builder.delete (2,1);tricky part  it doesn't
        builder.delete (1,1);//doesnt change anything
        System.out.println (builder);

        //reverse

        StringBuilder sb1=new StringBuilder ("ABC123");
        sb1.reverse ();
       // sb1.reverse ().reverse ();//same
        System.out.println (sb1);

       String myString=sb1.toString ();
       myString= myString.toLowerCase ();//immutuble  assigned
        System.out.println (myString);



    }
}
