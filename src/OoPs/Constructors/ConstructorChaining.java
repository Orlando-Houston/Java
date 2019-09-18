package OoPs.Constructors;

public class ConstructorChaining {
    ConstructorChaining(){

    }
    ConstructorChaining(String s){
        this();

        }
        ConstructorChaining(String s,int age){


        }

    public static void main(String[] args) {
        ConstructorChaining obj=new ConstructorChaining();
    }
    }


