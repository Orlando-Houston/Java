package SubjectHeadings.MethodFerhat.MethodFunction;

public class Main {
    public static void main(String[] args) {
        Abone abone=new Abone();
        abone.name="altun ";
        abone.balance=250 ;
        abone.city="houston";
        abone.naturalGasKullanimi(250);


        EncAbone encAbone=new EncAbone("zeynep",350,"houston");
        encAbone.bakiye_ogren();


    }

}
