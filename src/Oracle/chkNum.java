package Oracle;

public class chkNum {

    //return type if x is even
    boolean isEven(int x){
        if ((x%2)==0) return true;
        else return false;
    }
}
class Param{
    public static void main(String[] args) {
        chkNum num=new chkNum ();
        if (num.isEven (10) ) System.out.println ("10 is even");
        if (num.isEven (9) ) System.out.println ("9 is even");
        if (num.isEven (8) ) System.out.println ("8 is even");

    }
}
