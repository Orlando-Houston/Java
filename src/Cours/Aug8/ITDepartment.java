package Cours.Aug8;

public class ITDepartment extends Department {
    public String skills;
    public ITDepartment(String name,int id,String position,double salary,String skills){
        super(name,id,position,salary);
        this.skills=skills;
    }
    public void addSkill(String newSkill){
        this.skills = this.skills + ","+ newSkill;
    }
    public String toString() {
        return "ITDepartment{" +
                "skills='" + skills + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

