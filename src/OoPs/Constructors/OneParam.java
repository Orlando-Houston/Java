package OoPs.Constructors;

public class OneParam {
    private int var;
    public OneParam(int num) {
        var=num;
    }
    public int getValue() {
        return var;
    }
    public static void main(String args[]) {
        OneParam myobj = new OneParam(12);
        System.out.println("value of var is: "+myobj.getValue());
    }
}
