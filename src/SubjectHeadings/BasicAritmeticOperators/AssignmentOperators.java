package SubjectHeadings.BasicAritmeticOperators;
/*Assignments operators in java are: =, +=, -=, *=, /=, %=
        num2 = num1 would assign value of variable num1 to the variable.

        num2+=num1 is equal to num2 = num2+num1

        num2-=num1 is equal to num2 = num2-num1

        num2*=num1 is equal to num2 = num2*num1

        num2/=num1 is equal to num2 = num2/num1

        num2%=num1 is equal to num2 = num2%num1

 */



public class AssignmentOperators {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println("= Output: "+num2);

        num2 += num1;
        System.out.println("+= Output: "+num2);

        num2 -= num1;
        System.out.println("-= Output: "+num2);

        num2 *= num1;
        System.out.println("*= Output: "+num2);

        num2 /= num1;
        System.out.println("/= Output: "+num2);

        num2 %= num1;
        System.out.println("%= Output: "+num2);
    }
}
