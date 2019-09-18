package Aug24Abstraction;

public class ClassChild implements InterFaceA,InterFaceB {
    @Override
    public void methodA() {
        System.out.println("This is form Interface A");

    }

    @Override
    public void methodB() {
        System.out.println("This is from InterFace B");

    }
}
