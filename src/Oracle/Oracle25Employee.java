package Oracle;

public class Oracle25Employee {
    String name;
    boolean contract;
    double salary;

    Oracle25Employee(){
        this.name=new String("Joe");
        this.contract= new Boolean (true);
        this.salary=100.0;
    }
    public String toString(){
        return name+":"+contract+":"+salary;

    }

    public static void main(String[] args) {
        Oracle25Employee o25Emp=new Oracle25Employee ();
        o25Emp.name="Joe";
        o25Emp.contract=true;
        o25Emp.salary=100;

        System.out.println (o25Emp);
    }
}
