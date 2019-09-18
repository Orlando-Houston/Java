package SubjectHeadings.GetSet;

public class Student  {
    private  String studentName;
    private  int rollNo;
    private int studentAge;
    public Student(int rollNo,String studentName,int studentAge) {
        this.rollNo=rollNo;
        this.studentName=studentName;
        this.studentAge=studentAge;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    public int compareTo(Student comperestu){
        int compareage=((Student)comperestu).getStudentAge();
        return this.studentAge-compareage;
    }

    @Override
    public String toString() {
        return "[rollno="+rollNo+",name="+studentName+",age="+studentAge+"]";
    }
}



