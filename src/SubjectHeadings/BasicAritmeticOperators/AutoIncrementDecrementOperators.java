package SubjectHeadings.BasicAritmeticOperators;
/*++ and —
num++ is equivalent to num=num+1;

num–- is equivalent to num=num-1;

 */


public class AutoIncrementDecrementOperators {
    public static void main(String args[]){
        int num1=100;
        int num2=200;
        num1++;
        num2--;
        System.out.println("num1++ is: "+num1);
        System.out.println("num2-- is: "+num2);
    }

}
