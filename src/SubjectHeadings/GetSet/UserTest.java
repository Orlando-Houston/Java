package SubjectHeadings.GetSet;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        User user=new User();

        System.out.println("enter name");
        String name=scan.next();
        user.setName("altun");

        System.out.println("enter lastname");
        String lastname=scan.next();
        user.setLastName("keskin");

        System.out.println("enter age");
        int age=scan.nextInt();
        user.setAge(49);

        System.out.println("Check");
        System.out.println(user.getName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
    }
}
