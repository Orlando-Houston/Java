package Udemy;

public class SuperVisor extends Employee { //error compile
    private int  manager;

    public SuperVisor(String name,int salary,String department,int manager){//
        super(name,salary,department);
        this.manager=manager;

    }
    public void increase(int salaryRate){
        System.out.println ("Employees were raised"+salaryRate);

    }
    public void showTheInformation(){
        super.showInformation ();

        System.out.println ("Manager number"+manager);

    }



}
