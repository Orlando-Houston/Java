package Udemy;

public class PersonThis {

    private String firsName;
    private String lastName;

    public PersonThis(){
        this("Zeynep","Ozder");

    }

    public PersonThis(String firstName,String lastName){
        this.firsName=firstName;
        this.lastName=lastName;


    }
    public void setFirsName(String firstName){
       // this();  methodda kullanilamaz
        this.firsName=firstName;
    }
    public String getFirsName(){
        return firsName;
    }
    public String getFullName(){
        return  firsName+lastName;
    }

    public static void main(String[] args) {
        
    }
}
