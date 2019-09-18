package OoPs.Constructors;

public class PrivateConstructor {

    //Static SubjectHeadings.Class Reference
    private static PrivateConstructor obj=null;
    private PrivateConstructor(){
        /*Private Constructor will prevent
         * the instantiation of this class directly*/
    }
    public static PrivateConstructor objectCreationMethod(){
        /*This logic will ensure that no more than
         * one object can be created at a time */
        if(obj==null){
            obj= new PrivateConstructor();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class Example");
    }
    public static void main(String args[]){
        //Object cannot be created directly due to private constructor
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
        PrivateConstructor myobject= PrivateConstructor.objectCreationMethod();
        myobject.display();
    }
}
