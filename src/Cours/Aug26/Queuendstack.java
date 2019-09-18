package Cours.Aug26;
import java.util.LinkedList;
import java.util.Queue;


public class Queuendstack {
    public static void main(String[] args) {
        Queue myQ = new LinkedList<Integer>();
        myQ.add(1);
        myQ.add(2);
        System.out.println(myQ.peek());
        myQ.remove();
        System.out.println(myQ.peek());
    }
}
