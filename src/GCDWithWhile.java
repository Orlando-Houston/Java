public class GCDWithWhile {
    public static void main(String[] args) {

        int num1 = 12, num2 = 8;

        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

        System.out.printf("GCD of given numbers is: %d", num2);
    }

}
