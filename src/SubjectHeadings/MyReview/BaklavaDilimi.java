package SubjectHeadings.MyReview;

public class BaklavaDilimi {
    public static void main(String[] args) {
        int i,j;
        int bosluk,satir,yildiz;
        satir=7;
        bosluk=satir/2;
        yildiz=1;
        for (i=0;i<satir;i++){
            for (j=0;j<bosluk;j++){
                System.out.print(" ");
            }
            for (j=0;j<yildiz;j++){
                System.out.print("*");
            }
            if (i<satir/2){                    //baklava diliminin ustu
                bosluk--;
                yildiz+=2;
            }
            else{                                 //baklava diliminin alt kismi
                bosluk++;
                yildiz-=2;
            }
            System.out.println();
        }

    }
}
