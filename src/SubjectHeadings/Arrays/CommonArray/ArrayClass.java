package SubjectHeadings.Arrays.CommonArray;
import java.util.Arrays;//SubjectHeadings.Arrays class'ını kullanabilmek için import ediyoruz


public class ArrayClass {

    public static void main(String args[]){
        int[] liste = {2, 4, 7, 10, 11, 45, 50, 52, 59, 60, 66, 69, 70, 79}; //Arrayimizi Sıralı biçimde oluşturduk

        int sayiIndex = Arrays.binarySearch(liste,52); //SubjectHeadings.Arrays.binarySearch methoduna dizimizi ve aradığımız sayıyı gönderiyoruz
        if(sayiIndex >= 0){ //method 0 dan küçük dönmüyorsa aradığımız sayıyı bulmuşuz demektir
            System.out.println("Aranan sayının index'i :"+sayiIndex);
        }else{ //sayı 0 dan küçük döndüğünde aradığımız sayı dizi içinde değildir.
            System.out.println("Aranan sayı bulunamadı.");


        }
    }

}
