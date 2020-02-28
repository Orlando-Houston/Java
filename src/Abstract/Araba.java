package Abstract;

public  abstract class Araba {
    private int agirlik;
    private String renk;
    private String model;


    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public abstract   int  saateYaktigiBenzinLitresi();
}
class Jeep extends Araba{
    private int cantKalinligi;

    public int getCantKalinligi(){
        return cantKalinligi;
    }
    public void setCantKalinligi(int cantKalinligi){
        this.cantKalinligi=cantKalinligi;
    }
    public  int saateYaktigiBenzinLitresi(){
        return getAgirlik ()*2;
    }

}

class Ford extends Araba{
    private  int devirSayisi;

    public int getDevirSayisi() {
        return devirSayisi;
    }

    public void setDevirSayisi(int devirSayisi) {
        this.devirSayisi = devirSayisi;
    }
    public int saateYaktigiBenzinLitresi(){
        return getAgirlik ()*1;
    }
}
class userScreen{
    public void show(Araba[]arabalar){
        for (int i=0;i<arabalar.length;i++){
            Araba araba=arabalar[i];

            System.out.println ("Agirlik:"+araba.getAgirlik ());
            System.out.println ("Model:"+araba.getModel ());
            System.out.println ("Renk:"+araba.getRenk ());
            System.out.println ("Yaktigi litre benzin"+araba.saateYaktigiBenzinLitresi ());
        }
    }
}


