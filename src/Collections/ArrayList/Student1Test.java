package Collections.ArrayList;

import java.util.ArrayList;

public class Student1Test {
    public static void main(String[] args) {
        ArrayList<Student1>list=new ArrayList<Student1>();
        list.add(new Student1("Chaitanya", 26));
        list.add(new Student1("Ajeet", 25));
        list.add(new Student1("Steve", 55));
        list.add(new Student1("Mary", 18));
        list.add(new Student1("Dawn", 22));
        for (Student1 tmp: list){
            System.out.println(tmp);
        }
    }
    }

