package Generic;

public class Main {
    public static void main(String[] args) {
        Character[]char_array={'J','A','V','A'};
        Integer[]integer_array={1,2,3,4,5,6};

        String[]string_array={"java","pyton","C++","php"};

        Student[]student_array={new Student("Altun"),new Student("Zeynep"),new Student("Turgay")};
        charPrint.print (char_array);
        integerPrint.print (integer_array);
        stringPrint.print (string_array);
        studentPrint.print (student_array);
    }
}
