package Cours.Aug5;

public class ArrayClassConstTest {
    public static void main(String[] args) {
        ArrayClassConst myInstance = new ArrayClassConst();
            System.out.println(myInstance.size);
            ArrayClassConst myInstance2 = new ArrayClassConst(20);
            myInstance.printEvenIndexes(myInstance.initialArray());
            myInstance.printOddIndexes(myInstance.initialArray());

    }

}
