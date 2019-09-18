package SubjectHeadings.Arrays.CommonArray;

public class LinearSearch {
    public static void main(String args[]){
        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz

        int sayiIndex = linearSearch(liste,52); //linearSearch methoduna dizimizi ve aradığımız sayıyı gönderiyoruz
        if(sayiIndex != -1){ //method -1 dönmediyse sayı bulunmuştur
            System.out.println("Aranan sayının index'i :"+sayiIndex);
        }else{ //-1 döndüğünde -1 dönecek ve else düşecek
            System.out.println("Aranan sayı bulunamadı");
        }
    }

    private static int linearSearch(int[] liste, int arananSayi) { //linearSearch metotumuz

        for (int i = 0; i <liste.length; i++) { //döngümüz dizimizin uzunluğu kadar dönüyor
            if(liste[i] == arananSayi){ //sırası ile tüm elemanlara bakıyourz
                return i; //eğer aradığımız elemanı bulduysak index'ini geri gönderiyoruz
            }
        }
        return -1; //Herhangi  bir değer bulunamadıysa -1 dönderiyoruz
    }
}


