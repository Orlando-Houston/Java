package SubjectHeadings.Arrays.CommonArray;
import java.util.Arrays;

public class ArraySortMeth {
    public static void main(String[] args)
    {
        int[] list = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz

        //Diziyi sıralamak için SubjectHeadings.Arrays.sort() kullanırız
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}


