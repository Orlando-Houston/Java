package Oracle;

public class O37While {


    static  int count=0;
     int i=0;

     public void changeCount(){
         while (i<5){
             i++;
             count++;
         }
     }

    public static void main(String[] args) {
        O37While check1=new O37While ();
       O37While check2=new O37While ();

       check1.changeCount ();
       check2.changeCount ();

       System.out.print (check1.count+":"+check2.count);

   }
  /*
    public static void main(String[] args) {
         int i=0;
         while(i<5){
             System.out.println ("i="+i);
             i++;
         }


    }

   */
}
