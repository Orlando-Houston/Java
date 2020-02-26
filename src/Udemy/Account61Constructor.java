package Udemy;

public class Account61Constructor {
    private String accountNumber;
    private double balance;  //bakiye
    private String name;

    private String email;
    private String phoneNum;

    public Account61Constructor(){        //constructor

    }
    public Account61Constructor(String accountNumber,double balance, String name,String email, String phoneNum){  // overloading
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phoneNum=phoneNum;
    }





    public void deposit(double amount){        //para yatirmak
        balance+=amount;        //if you want this. can write
        System.out.println ("new balance="+balance);
    }


    public void withdrawal(double amount){    ///amount mean miktar
        if (amount>800){
            System.out.println (" if You were$ 800 a day,you wouldn't  be able to withdrawal  more...");
            if (balance-amount<0){
                System.out.println ("not enough balance.Balance="+balance);
            }
            else{
                balance-=amount;
                System.out.println ("new balance="+balance);
            }
        }
    }
/*

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

     */
}
