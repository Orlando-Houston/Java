package Cours.Aug8;

public class AccountingDepartment  extends Department{
    int experience;
    public AccountingDepartment (String name,int id, String position,double salary,int experience){
        super(name,id,position,salary);
        this.experience=experience;
    }
    public void addExperience(int newExperience){
        this.experience = this.experience + newExperience;
    }

    public String toString() {
        return "AccountingDepartment{" +
                "experience=" + experience +
                ", employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}


