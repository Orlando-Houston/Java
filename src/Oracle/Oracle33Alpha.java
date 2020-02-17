package Oracle;

 class Oracle33Alpha {
    int ns;
    static int s;
    Oracle33Alpha(int ns){
        if (s<ns){
            s=ns;
            this.ns=ns;
        }
    }
    void doPrint(){
        System.out.println ("ns="+ns+"s="+s);
    }
}

 class TestA{
    public static void main(String[] args) {
        Oracle33Alpha ref1=new Oracle33Alpha (50);
        Oracle33Alpha ref2=new Oracle33Alpha (125);
        Oracle33Alpha ref3=new Oracle33Alpha (100);
        ref1.doPrint ();
        ref2.doPrint ();
        ref3.doPrint ();
    }
}


