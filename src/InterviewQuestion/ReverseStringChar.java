package InterviewQuestion;

public class ReverseStringChar {
    public static void main(String[] args) {
        String input="QA Automation Bootcamp";
        char[] newInput=input.toCharArray();
        for (int i=newInput.length-1;i>=0;i--){
            System.out.println(newInput[i]);
        }
    }
}
