package Udemy;

public class StringBuilderExample {
    public static void main(String[] args) {
        String myString="";
        for (char c='a';c<='z';c++){
            myString+=c;//every iterarion this will create new string object
        }
        System.out.println (myString);



        //with stringBuilder
        StringBuilder sb=new StringBuilder ();//create new instance of StringBuilderObject
        for (char c='a';c<='z';c++){
            sb.append (c);//add char to string builder,reuses stringbuilder without creating string each time
        }
        System.out.println (sb);

        //
        StringBuilder builder=new StringBuilder("start");
        builder.append ("-middle");//"start-middle"
        StringBuilder anotherBuilder=builder.append ("-end");

        System.out.println (builder);
        System.out.println (anotherBuilder);

        System.out.println (builder==anotherBuilder);
        System.out.println (System.identityHashCode (builder));
        System.out.println (System.identityHashCode (anotherBuilder));




        StringBuilder myBuilder=new StringBuilder ();
        System.out.println ("size="+myBuilder.length ());
        System.out.println ("capacity="+myBuilder.capacity ());


        myBuilder=new StringBuilder (100);
        System.out.println ("size="+myBuilder.length ());
        System.out.println ("capasity="+myBuilder.capacity ());


        myBuilder.append ("MyNewTest");
        System.out.println ("size="+myBuilder.length ());
        System.out.println ("capasity="+myBuilder.capacity ());


        StringBuilder a=new StringBuilder ("This ");
        StringBuilder b=a.append ("java ");
        b=b.append ("is").append (" so ").append ("cool");

        System.out.println (a);
        System.out.println (b);
        System.out.println (a==b);
        System.out.println (System.identityHashCode (a));
        System.out.println (System.identityHashCode (b));

    }
}
