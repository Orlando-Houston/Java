package Udemy;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] one=new int[3];//array with 3 elements
        int[]two=new int[]{10,11,12};//array with 3 elements,not empty array

        //double[]a=new double[2.55];
        double[] b=new double[4*5/2];//creates array with 10 elements

        int x=4;
        int y=4;
        double[]c=new double[x*y];//creates empty array with 16 elements

        double[]three={10,11,12};//anonymus array
        int[]four={};



        int[]a1;
        int[]a2;
        int a3[];
        int a4[];

        int[]ids,types;//creates 2 array
        int ds2[],types2;//creates 2 arrays and int,bad practise


        String []animals={"parrot","dog","cat"};  //is also object
        String[]myAnimals=animals;
        String[]otherAnimals={"parrot","dog","cat"};

        System.out.println (animals.equals (myAnimals));//true
        System.out.println (animals==myAnimals);//true
        System.out.println (Arrays.equals (animals,myAnimals));//true


        System.out.println (animals.equals (otherAnimals));//false
        System.out.println (Arrays.equals (animals,otherAnimals));//true


        System.out.println (animals);
        System.out.println (animals.toString ());

        System.out.println (Arrays.toString (animals));






    }
}
