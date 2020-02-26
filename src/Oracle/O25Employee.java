package Oracle;

public class O25Employee {

    String name;
    boolean contract;
    double salary;






    O25Employee(){   //constructor



        this.name=new String ("Joe");
        this.contract= new Boolean (true);
        this.salary= new Double(100);

        //line n1


    }

    public String toString()  //override method in object
    {
        return name+":"+contract+":"+salary;
    }

    public static void main(String[] args) {



        O25Employee e=new O25Employee ();
        e.name="Joe";
        e.contract=true;
        e.salary=100;
        //line n2



        System.out.println (e);

    }
}
