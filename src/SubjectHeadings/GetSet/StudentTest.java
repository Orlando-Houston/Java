package SubjectHeadings.GetSet;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<Student>();
        list.add(new Student(1,"Mahir",32));
        list.add(new Student(2,"Osman",25));
        list.add(new Student(3,"Valeed",28));
        list.add(new Student(4,"Altun",49));
        System.out.println(list);
    }
}
