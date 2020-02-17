package Oracle;

public class Syntax5Reverse {
    public static void main(String[] args) {
        //usung reverse function://show only after learning  String buffer
        String a="Hello Syntax";

        StringBuffer sb=new StringBuffer (a);
        System.out.println (sb.reverse ());

        //without using reverse function:
        String toReverse="hello world";

        //1 way using charAt();
        String reversed="";
        for (int i=toReverse.length ()-1;i>=0;i--){
            reversed=reversed+toReverse.charAt (i);
        }
        System.out.println ("Reversed string is:"+reversed);

        //2 way using to charArray();
        String reversed1="";
        char[]array=toReverse.toCharArray ();
        for (int i=array.length-1;i>=0;i--){
            reversed1=reversed1+array[i];
        }
        System.out.println (reversed1);

        //3 way using substring
        String reversed2="";
        for (int i=toReverse.length ();i>=1;i--){
            reversed2=reversed2+toReverse.substring (i-1,i);

            }
        System.out.println ("Reversed string is:"+reversed2);
        //Reverse a string word by word

        String str="Today is Wendsday";
        String reversed3="";
        String[]array3=str.split ("");

        for (int i=array.length-1;i>=0;i++){
            reversed=reversed+array3[i]+"";
        }
        System.out.println (reversed);
        }

    }

