package Udemy;

public class CommonArraysProblems {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        for (int i=1;i<numbers.length;i++){
           // System.out.println (i);//return the number of iteration
            System.out.println (i+"-"+numbers[i]);//return  index and elements
        }
        for (int i=1;i<=numbers.length-1;i++){
            System.out.println (i+"-"+numbers[i]);
        }
       // int[20]nums; this will not compile
        int[]nums=new int[20];//correct way size only at initialization
        //baslatirken size verince bir daha degistiremiyoruz  fixed
       // int size=numbers.length();//brackets represent methods//length not methods inside array it is
        //field ,variable and it is final  //doesn't compile
        int size=numbers.length;//this is compiler

       // numbers.length=10;//length final variable.so we cant change final variable//constant variables
        //doesn't compile you cant set length of array,only initilation

    }
}
