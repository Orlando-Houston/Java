package OoPs.Constructors;

public class Paramet {
    private int var;
    //default constructor
    public Paramet()
    {
        this.var = 10;
    }
    public int getValue()
    {
        return var;
    }
    public static void main(String args[]) {
        Paramet obj = new Paramet();
        Paramet obj2 = new Paramet();
        System.out.println("var is: " + obj.getValue());
        System.out.println("var is: " + obj2.getValue());
    }








}
