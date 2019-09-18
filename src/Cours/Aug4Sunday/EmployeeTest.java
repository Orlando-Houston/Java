package Cours.Aug4Sunday;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        myEmployee.displayEmployeeInfo();
        System.out.println("------------------------------------------------------");
        Employee myEmployee2 = new Employee();
        myEmployee2.displayEmployeeInfo();
        System.out.println("------------------------------------------------------");
        Employee myEmployeeParameters = new Employee("Java",999,"OOD",999999.99,"Full Time");
        myEmployeeParameters.displayEmployeeInfo();
    }
}

