package Udemy;

public class Account62Constructor {
    private String accountNumber;
    private double balance;  //bakiye
    private String name;

    private String email;
    private String phoneNum;




    public Account62Constructor(){    //default   dosnt take action  islem yapmak
       // System.out.println ("our writing constructor");
        /*
        this.accountNumber="No information";
        this.balance=0.0;
        this.name="No information";
        this.email="No information";
        this.phoneNum="No information";*/

       this("No information",0.0,"No information","No information","No information") ;
        //kullandigimiz this()  alttaki methodun paramrtrelrini kullaniyor..veri girebiliyoruz
    }

    public Account62Constructor(String name,String email,String phoneNum){
        /*
        this.name=name;
        this.email=email;
        this.phoneNum=phoneNum;

        this.balance=0.0;
        this.accountNumber="no information";
        
         */

        this("no information",0.0,name,email,phoneNum);

    }


    public Account62Constructor(String accountNumber,double balance, String name,String email, String phoneNum){  // overloading
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phoneNum=phoneNum;
    }
}