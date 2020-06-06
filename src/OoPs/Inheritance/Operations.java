package OoPs.Inheritance;

public class Operations {
    public int a,b,c;
    public Operations(){
        this.a=10;
        this.b=20;
        this.c=30;
    }
    public Operations(int a){
        this.a=a;
        this.b=20;
        this.c=30;
    }
    public Operations(int a,int b){
        this.a=a;
        this.b=b;
        this.c=30;
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
    private void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }

}





 class OpsTest {
    public static void main(String[] args) {
        Operations parent = new Operations();
        parent.add(2,3);
        AdvancedOps child = new AdvancedOps();
        child.sumProduct(2,3,4);
        parent.multiply(4,5);
        child.multiply(7,8);
        System.out.println(parent.a+""+parent.b+""+parent.c);
        Operations parent2 = new Operations(55);
        System.out.println(parent2.a);
        System.out.println(parent2.b);
        System.out.println(parent2.c);


    }
}


