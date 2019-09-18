package SubjectHeadings.MethodFerhat.MethodFunction;

public class Abone {
    public String name;
    public int balance;
    public String city;

    public  void naturalGasKullanimi( int miktar) {
        if ((this.balance-miktar)<0){
            System.out.println("yeterli balance yok");
        }
        else{
            this.balance-=miktar;
            if (this.balance<=0){
                System.out.println("balanciniz bitmistir.kredi yukleyiniz");
            }
            else{
                System.out.println("Yeni balance:"+balance);
            }

        }


    }

    public  void balance_ogren(String[] args) {
        System.out.println("balance"+balance);

    }
}
