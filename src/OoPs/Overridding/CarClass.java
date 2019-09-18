package OoPs.Overridding;

public class CarClass {
    /*Here speedLimit() method of class Ford is overriding the speedLimit() method of class CarClass.

     */
    public int speedLimit()
    {
        return 100;
    }
}
class Ford extends CarClass
{
    public int speedLimit()
    {
        return 150;
    }
    public static void main(String args[])
    {
        CarClass obj = new Ford();
        int num= obj.speedLimit();
        System.out.println("Speed Limit is: "+num);
    }
}
