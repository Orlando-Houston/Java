package SubjectHeadings.MethodFerhat.MethodFunction;

public class EncAbone {
    private String name;
    private int bakiye=150;
    private String city;

    public EncAbone(String name,int bakiye,String city) {
        this.name=name;
        if (bakiye>=0&& bakiye<=150){
            this.bakiye=bakiye;

        }
        this.city=city;

    }

    public  void dogalgaz_kullan(int miktar) {
        if ((this.bakiye-miktar)<0){
            System.out.println("yeterli miktarda bakiye yok");
        }
        else{
            System.out.println("yeterli bakiye"+bakiye);
        }

    }



    public  void bakiye_ogren() {
        System.out.println("bakiye:"+bakiye);

    }}
