package Udemy;

public class Employee {   //Base class   super class

   // fields  global variable
    private String name;    //instance(non-static )variable
    private int salary;
    private  String  department;


    public Employee(String name,int salary,String department){   //constructor

        this.setName (name);
        this.setSalary (salary);
        this.setDepartment (department);

    }
    public void work(){      ///instance method
        System.out.println ("people  are working");

    }
    public void showInformation(){
        System.out.println ("name"+ getName ());
        System.out.println ("salary"+ getSalary ());
        System.out.println ("Department"+ getDepartment ());

    }
    public void  changeToDepartment(String newDepartment){
        System.out.println ("change the department");
        this.setDepartment (newDepartment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
