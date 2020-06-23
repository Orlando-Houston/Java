package Enum;

public class First {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Level myEnumVar = Level.LOW;
        myEnumVar = Level.HIGH;
        System.out.println(myEnumVar);
    }
}
