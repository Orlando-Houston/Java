package OoPs.Inheritance;

public class AdvancedOps extends Operations {
    public AdvancedOps(){
        super();

    }
    public AdvancedOps(int a){
        super(20,40);
    }
    public void sumProduct(int a,int b,int c){
        System.out.println((a+b)*c);
    }
}
