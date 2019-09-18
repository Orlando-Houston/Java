package OoPs.Interface;
import java.util.Arrays;

public class DiceTest {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        Dice myDice2 = new Dice(10,5);
        System.out.println(myDice.roll());
        System.out.println(myDice2.biasedRoll());
        int[] result = myDice2.rollTriple();
        System.out.println(Arrays.toString(result));
    }
}
