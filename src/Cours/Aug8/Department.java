package Cours.Aug8;

public class Department {
    String employeeName;
    int employeeID;
    String position;
    double salary;
    public Department(String name,int id, String position,double salary){
        this.employeeName=name;
        this.employeeID=id;
        this.position=position;
        this.salary=salary;
    }
    public String toString() {
        return ("Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}');
    }
    public void changePosition(String newPosition){
        this.position=newPosition;
    }
    public void riseSalary(double rise){
        this.salary = this.salary +rise;
    }

}
