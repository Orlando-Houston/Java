package Cours.Jul24day27;

public class Merge2Array {
    public static void main(String[] args) {
        int[]name1={1,2,3,4,5};
        int[]name2={6,7,8,9};
        int[]merge=new int[name1.length+name2.length];
        int c=0;



        for (int i=0;i<name1.length;i++){
        merge[i]=name1[i];
        c++;
        }
        for (int j=0;j<name2.length;j++){
        merge[c++]=name2[j];

        }
        for (int i=0;i<merge.length;i++){
        System.out.print(merge[i]+" ");
        }

        }
        }
