package Cours.Aug6;

public class CoffeeMakerTest {
    public static void main(String[] args) {
        CoffeeMaker myCoffee = new CoffeeMaker();
        myCoffee.checkTheStatus();
        myCoffee.resetTimer();
        myCoffee.checkTheStatus();
        myCoffee.setCups(10);
        myCoffee.checkTheStatus();

    }
}
