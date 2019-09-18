package SubjectHeadings.MethodFerhat;

public class Value2Message {
    public static void main(String[] args) {

   messageWrite("Altun","Keskin",48);

        messageWrite("Ahmet","Keskin",53);
        messageWrite("Afet","Keskin",22);
        messageWrite("Hamide","Keskin",20);
        messageWrite("Rana","Keskin",18);
        messageWrite("","A",100);


        System.out.println();
        characterWrite('a');
        characterWrite('+');
        characterWrite('A');



    }

    public static void messageWrite( String name,String lastname,int old) {


        System.out.println("Merhaba");

        System.out.println("Your name:"+name);

        System.out.println("Your Lastname:"+lastname);

        System.out.println("Your old:"+old);
        System.out.println();



    }

    public static void characterWrite(char c) {
        System.out.println("Take a character:"+c);
        System.out.println();


    }
}
