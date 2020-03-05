package Generic;

public class MainGen {
    public static void main(String[] args) {
        Character[]char_array={'J','A','V','A'};
        Integer[]integer_array={1,2,3,4,5,6};

        String[]string_array={"java","pyton","C++","php"};

        Student[]student_array={new Student("Altun"),new Student("Zeynep"),new Student("Turgay")};
        PrintingClass<Character>print_char=new PrintingClass<> ();
        PrintingClass<String>print_string=new PrintingClass<> ();
        PrintingClass<Integer>print_int=new PrintingClass<> ();
        PrintingClass<Student>print_student=new PrintingClass<> ();

        print_char.print (char_array);
        System.out.println ("************************************");
        print_string.print (string_array);
        System.out.println ("*************************************");
        print_int.print (integer_array);
        System.out.println ("****************************************");
        print_student.print (student_array);
}
}
