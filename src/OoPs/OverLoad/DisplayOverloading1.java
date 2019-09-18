package OoPs.OverLoad;

public class DisplayOverloading1 {
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
        System.out.println(c );
    }
}

class Sample2
{
    public static void main(String args[])
    {
        DisplayOverloading1 obj = new DisplayOverloading1();
        obj.disp('a');
        obj.disp(5);
    }
}
