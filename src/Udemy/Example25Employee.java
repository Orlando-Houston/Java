package Udemy;

public class Example25Employee {
   public  String name;  //  global variable non static  instance variable
   public  boolean contract;
  public   double salary;

  public Example25Employee(){
     this. name="Joe";
      contract=true;
      salary=100;

  }
  public  void print(){
      System.out.println ( name+":"+contract+":"+salary);
  }


    public static void main(String[] args) {
        Example25Employee exm=new Example25Employee ();
       // exm.name="Joe";
       // exm.contract=true;
      //  exm.salary=100;
        exm.print ();

    }
}
