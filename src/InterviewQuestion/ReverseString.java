package InterviewQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String input="QA Automation Bootcamp";
        StringBuilder newInput=new StringBuilder();

        newInput.append(input);
        System.out.println(newInput.reverse());
    }
}
