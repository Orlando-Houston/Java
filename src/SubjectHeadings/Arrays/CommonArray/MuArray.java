package SubjectHeadings.Arrays.CommonArray;

public class MuArray {
    private void multidimensionalArrayTest() {
        String[][] mobilhanemYazarlari = {
                {"Alper", "Beyler"},
                {"Alper", "Öcal"},
                {"Aycan", "Ayhan"},
                {"Enes", "Ateş"},
                {"Eren", "Başaran"},
                {"Taha", "Kırca"},
                {"Vehbi", "Akdoğan"},
                {"Yiğit", "Serin"},

        };
        stringArrayPrinter(mobilhanemYazarlari);

        String[][] mobilhanemYazarlariListesi = new String[8][2];
        mobilhanemYazarlariListesi[0][0] = "Alper";
        mobilhanemYazarlariListesi[0][1] = "Beyler";
        mobilhanemYazarlariListesi[1][0] = "Alper";
        mobilhanemYazarlariListesi[1][1] = "Öcal";
        mobilhanemYazarlariListesi[2][0] = "Aycan";
        mobilhanemYazarlariListesi[2][1] = "Ayhan";
        mobilhanemYazarlariListesi[3][0] = "Enes";
        mobilhanemYazarlariListesi[3][1] = "Ateş";
        mobilhanemYazarlariListesi[4][0] = "Eren";
        mobilhanemYazarlariListesi[4][1] = "Başaran";
        mobilhanemYazarlariListesi[5][0] = "Taha";
        mobilhanemYazarlariListesi[5][1] = "Kırca";
        mobilhanemYazarlariListesi[6][0] = "Vehbi";
        mobilhanemYazarlariListesi[6][1] = "Akdoğan";
        mobilhanemYazarlariListesi[7][0] = "Yiğit";
        mobilhanemYazarlariListesi[7][1] = "Serin";

        stringArrayPrinter(mobilhanemYazarlariListesi);
    }

    private void stringArrayPrinter(String[][] strArray) {
        int rowSize = strArray.length;
        for(int row=0; row<rowSize; row++) {
            int columnSize = strArray[row].length;
            for(int column=0; column<columnSize; column++) {
                System.out.print(strArray[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}
