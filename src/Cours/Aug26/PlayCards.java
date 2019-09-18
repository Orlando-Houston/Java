package Cours.Aug26;

import java.util.Stack;

public class PlayCards {
    public static void main(String[] args) {
        String[] cards={"1","2","3","4","5","6","7","8","9","10","JACK","QUENN","KING","ACE"};
        double rand=Math.random()*14;
        Stack<String>myCards=new Stack<>();
        for (int i=1;i<6;i++){
            rand=Math.random()*14;
            myCards.push(cards[(int )rand]);
        }
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
    }
}
