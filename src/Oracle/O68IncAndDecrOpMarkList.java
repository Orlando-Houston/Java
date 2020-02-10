package Oracle;

public class O68IncAndDecrOpMarkList {
    int num;

    public static  void  graceMarks(O68IncAndDecrOpMarkList   obje4){
        obje4.num+=10;

    }

    public static void main(String[] args) {
        O68IncAndDecrOpMarkList obj1=new O68IncAndDecrOpMarkList ();
        O68IncAndDecrOpMarkList ob2=obj1;
        O68IncAndDecrOpMarkList ob3=null;

        ob2.num=60;
        graceMarks (ob2);


    }
}
