package Oracle;

public class Oracle13CD {
    int r;
    Oracle13CD(int r){
        this.r=r;
    }
}
class DVD extends Oracle13CD{
    int c;
    DVD(int r,int c){
        //line1    what should come here
        super(r);
        this.c=c;
        DVD dvd=new DVD (10,20);

    }
}
