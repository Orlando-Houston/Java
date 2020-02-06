package Udemy;

import java.util.Scanner;

public class Array2T {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println ("Enter value please");
        Scanner scann=new Scanner (System.in);
        for (int i=0;i<5;i++){
            a[i]=scann.nextInt ();


        }
        System.out.println ("----------------------------------");
        for (int i=0;i<5;i++)
        System.out.println (a[i]);


    }

    }

