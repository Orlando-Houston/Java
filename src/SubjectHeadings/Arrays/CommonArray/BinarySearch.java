package SubjectHeadings.Arrays.CommonArray;

public class BinarySearch {
    private static int binarySearch(int[] list, int key) {

        int[] liste = {2, 4, 7, 10, 11, 45, 50, 52, 59, 60, 66, 69, 70, 79}; //Arrayimizi Sıralı biçimde oluşturduk

        int baslangic = 0; //dizinin başlangıç index'i
        int son = list.length-1; //dizinin bitiş index'i
        int orta; //dizinin ortanca index'i

        while (baslangic<=son){ //baslangic sondan büyük olana kadar devam edecek , zaten başlangıç değeri sondan büyğk olursa aradığımız eleman dizide yok demektir
            orta = (int)(baslangic+son)/2; //her seferinde ortanca değer bulunucak
            if(list[orta]>key) { //ortanca değer aranan değerden büyükse array ikiye bölünecek
                son = orta - 1; //son değer, ortanca değerden 1 önceki değer olacak
            }
            else if(list[orta]==key) { //aranan bulundu
                return orta;//indexi dön
            }
            else {//ortanca değer aranan değerden küçükse
                baslangic = orta + 1; //baslangıç değeri, ortanca değerden 1 sonraki değer olacak
            }
        }

        return -1;//sonuç bulunamazsa -1 dönecek
    }

}
