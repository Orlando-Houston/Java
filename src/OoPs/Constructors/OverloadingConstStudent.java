package OoPs.Constructors;

public class OverloadingConstStudent {

     private int studentID;
    private String studentName;
    private int studentAge;

    OverloadingConstStudent(){
        //DefaultConstructor
        studentID=100;
        studentName="New student";
        studentAge=18;
    }
    OverloadingConstStudent(int num1,String str,int num2) {
        //parameterized constructor
        studentID = num1;
        studentName = str;
        studentAge = num2;
    }
    //getter and setter methods
    public int getStudentID(){
        return studentID;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public int getStudentAge(){
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }



    public static void main(String[] args) {
        //this object creation would call the default constructor
        OverloadingConstStudent myObj=new OverloadingConstStudent();

        System.out.println("Student name is:"+myObj.getStudentAge());
        System.out.println("student age is:"+myObj.getStudentAge());
    }
}
