package Oracle;

public class ReturnVoid {
    void  myMath(){

        int i;
        for (i=0;i<10;i++) {
            if(i==5) return;  //stop 5
            System.out.println ();
        }
    }
}

