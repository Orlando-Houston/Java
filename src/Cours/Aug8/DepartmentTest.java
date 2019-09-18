package Cours.Aug8;

public class DepartmentTest {
    public static void main(String[] args) {
        ITDepartment myIT = new ITDepartment("Jay",998,"QA Engineer",125000,"Java,SQL,Selenium,ISQTB");

        System.out.println(myIT.toString());
        myIT.addSkill("Ruby on Rail");
        System.out.println(myIT.toString());
        myIT.riseSalary(2000);
        System.out.println(myIT.toString());

        AccountingDepartment myAcc = new AccountingDepartment("Alice",667,"Accountant",75000,5);

        System.out.println(myAcc.toString());
        myAcc.addExperience(2);
        System.out.println(myAcc.experience);

        AccountingDepartment myAcc2 = new AccountingDepartment("Jason",554,"Manager",150000,20);
        System.out.println(myAcc2.experience);

    }
}
