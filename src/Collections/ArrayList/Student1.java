package Collections.ArrayList;

public class Student1 {
    private String studentName;
    private int studentAge;

   Student1(String name, int age) {
        this.studentName=name;
        this.studentAge=age;
    }

    @Override
    public String toString() {
         return "Name is: "+this.studentName+" & Age is: "+this.studentAge;
    }
}
