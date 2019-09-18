package SubjectHeadings.Arrays.CommonArray;

public class ArrayRandom2 {
    public static void main(String[] args) {
        int[] list=new int[20];
        double randomNumber;
        for (int i=0;i<list.length;i++){
            randomNumber=Math.random()*(5000-1000)+1000;
            list[i]=(int)randomNumber;
        }
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
