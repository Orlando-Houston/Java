package Oracle;

public abstract class Planet46 {

    protected void revolved(){ } //line n1

    abstract void rotate();  //line n2

    class Earth extends Planet46{
       protected void  revolve(){ }  //line n3  or public

        protected  void rotate(){}  //line n4
    }


}
//make the method at line n3 public or protected