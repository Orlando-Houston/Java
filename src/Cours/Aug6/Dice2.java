package Cours.Aug6;

public class Dice2 {
    private int YuzeySayisi;
    Dice2(){
        this.YuzeySayisi=10;

    }
    Dice2(int yuzeyler){
        this.YuzeySayisi=yuzeyler;
    }
    public  int getYuzeySayisi(){
        return this.YuzeySayisi;
    }
    public void zarSalla(){
        double rastgele=Math.random()*this.YuzeySayisi+1;
        System.out.println((int) rastgele);
        }

    public static void main(String[] args) {
        System.out.println(Math.random());
        Dice2 myDice=new Dice2();
        myDice.zarSalla();
        Dice2 myDiceSecond=new Dice2();
        myDiceSecond.zarSalla();
    }
    }

