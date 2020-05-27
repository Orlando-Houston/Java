package Kahot.March1;

public class Main2NestedMethod {
    public static void main(String[] args) {
        doSomething ();
    }

    public static void doSomething() {
        System.out.println (doAnotherThing ());

    }

    public static String doAnotherThing() {
        return"ABC";

    }
}
