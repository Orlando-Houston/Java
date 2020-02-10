package Udemy;

public class ConstructorPersonThis {
    private String firstName;
    private  String LastName;


     public ConstructorPersonThis(){ // default constructor
         this("Eric","Johnson");


     }

     public ConstructorPersonThis(String firstName){
         this();
         this.firstName=firstName;




     }

     public ConstructorPersonThis(String firstName,String last){
       //  this();  not available here
         this.firstName=firstName;
       //  this.LastName=last;
      //   String LastName="myName";

     }
}
