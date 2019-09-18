package Cours.Aug7;

public class CalculatorTest {
    public static void main(String[] args) {
        AdvancedCalculator myCalcAdv = new AdvancedCalculator();
        System.out.println(myCalcAdv.power(2,3));
        AdvancedCalculator myRedCalc = new AdvancedCalculator("red");
        System.out.println(myRedCalc.toString());
        myRedCalc.calcAverage(9,6);
        System.out.println(myRedCalc.toString());
        Calculator myClassicCalc = new Calculator();
        System.out.println(myClassicCalc.displayValue);
        System.out.println(myCalcAdv.calcFactorial(5));

    }


}

