package SubjectHeadings.Random;

public class ArrayRandom1 {
    public static void main(String args[]){

        int [] sayi = new int[100]; //Uzunluğu 100 olan diziyi oluşturduk

        for (int i = 0; i < sayi.length ; i++) {
            sayi[i] = (int)(Math.random()*1000); //Tüm elemanlarına 0-999 arasında değerler atıyoruz

        }

        int index = 0;
        int max=0;

        for (int i = 0; i < sayi.length ; i++) {
            if(sayi[i] > max){ //max sayıdan büyük ise
                max = sayi[i]; //max sayı değiştiriliyor
                index = i; //ve index alınıyor
            }
        }
        System.out.println("En büyük sayı: "+max+" index: "+index);
    }}


