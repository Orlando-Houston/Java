package Cours.Aug15;
import javax.swing.*;

public class Attandence {
    private String[] studentNames;
    private int[] studentIDs;
    int[][] weeklyCheck;
    final String[] DAYS_OF_THE_WEEK = {"Monday","Tuesday","Wednesday","Thursday","Friday"};

    Attandence(String[] studentNames, int[] studentIDs){
        this.studentNames = studentNames;
        this.studentIDs = studentIDs;
        int[][] weeklyCheck = new int[5][this.studentNames.length];
        this.weeklyCheck = weeklyCheck ;
    }
    void enterAttandence(String day){
        JFrame f = new JFrame();
        if(day.equals("Monday")){
            for(int i=0 ; i<this.studentNames.length ; i++){
                this.weeklyCheck[0][i] = Integer.parseInt( JOptionPane.showInputDialog(f,"Attandance for " +this.studentNames[i]));
            }
        }
        else if(day.equals("Tuesday")){

        }
    }
    void displayAttandence(){
        for(int i=0 ; i<this.weeklyCheck.length ; i++){
            System.out.printf("%20s %2s ",this.DAYS_OF_THE_WEEK[i], " : ");
            for(int j=0 ; j<this.weeklyCheck[i].length ; j++){
                if(this.weeklyCheck[i][j]==1) {
                    System.out.printf("%15s %2s",this.studentNames[j]," ");
                }
            }
            System.out.println();
        }
    }
    void displayAttandence(String day){

    }
}

