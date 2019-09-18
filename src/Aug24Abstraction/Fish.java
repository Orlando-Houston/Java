package Aug24Abstraction;

import OoPs.Interface.AnimalInterFace;

public class Fish implements AnimalInterFace {
    @Override
    public void makeSound() {
        System.out.println("blop blop");

    }

    @Override
    public void move() {
        System.out.println("Swimming");

    }
}
