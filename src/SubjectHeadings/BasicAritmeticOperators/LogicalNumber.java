package SubjectHeadings.BasicAritmeticOperators;
/*Logical operators in java are: &&, ||, !

 */

public class LogicalNumber {
    public static void main(String args[]) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: " + (b1||b2));
        System.out.println("!(b1 && b2): " + !(b1&&b2));
    }
}
