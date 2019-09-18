package Cours.Aug6;

public class CoffeeMaker {
    private int cups;
    private int timer;

    public CoffeeMaker(int cups, int timer) {
        this.cups = cups;
        this.timer = timer;
    }

    public CoffeeMaker() {
        this.cups=6;
        this.timer = 20;
    }

    public int getCups() {
        return cups;
    }

    public int getTimer() {
        return timer;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void setTheTimer(int newTimer){
        this.timer = newTimer;
        System.out.println("Timer is:"+this.timer);
    }
    public void checkTheStatus(){
        if(this.timer==0){
            System.out.println(this.cups+" cups coffee is ready");
        }
        else {
            System.out.println("Not ready yet");
        }
    }
    public void resetTimer(){
        this.timer =0;
        System.out.println("Timer is reset");
    }
}

