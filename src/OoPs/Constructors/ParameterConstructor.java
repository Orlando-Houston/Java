package OoPs.Constructors;

public class ParameterConstructor {
    int empId;
    String empName;

    //parameterized constructor with two parameters
    ParameterConstructor(int id, String name){
        this.empId = id;
        this.empName = name;

    }
    void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
    }
    public static void main(String args[]){
        ParameterConstructor obj1 = new ParameterConstructor(10245,"Chaitanya");
        ParameterConstructor obj2 = new ParameterConstructor(92232,"Negan");
        obj1.info();
        obj2.info();
    }
}
