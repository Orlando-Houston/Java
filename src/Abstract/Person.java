package Abstract;

public abstract class Person {
    //global variable ///instance variable(non static)
    private String name;
    private String gender;

    public Person(String nm,String gen){     //constructor
        name=nm;
        gender=gen;
    }
    //abstract method
    public  abstract void work();
    @Override
    public String toString(){
        return "Name="+this.name+"::Gender="+this.gender;
    }
    public void changeName(String newName){
        this.name=newName;
    }
}
class Employee extends Person{   //concrete class
    private int empId;

    public Employee(String nm,String gen,int id){
        super(nm, gen);
        this.empId=id;
    }
    public void work(){
        if (empId==0){
            System.out.println ("not working");
        }
        else{
            System.out.println ("working as employee");
        }
    }

    public static void main(String[] args) {
        //coding in terms of abstract classes
        Person student=new Employee ("Zeynep","female",0);
        Person employee=new Employee ("Ahmet","Male",123);

        student.work ();
        employee.work ();

        //using method implemented in abstract class-inheritance

        employee.changeName ("Selda");
        System.out.println (employee.toString ());
    }

}
