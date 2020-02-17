package Oracle;

import javax.swing.*;

public class Oracle8Fibonacci {
    public static void main(String[] args) {


    int n=10,t1=0,t2=1;
    for (int i=1;i<n;i++){
        System.out.println (t1+"");
        int sum=t1+t2;
        t1=t2;
        t2=sum;

    }
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }}
