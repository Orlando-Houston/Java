package Oracle;

public class SyntaxAlphaCharacter {

    public static void main(String[] args) {

        //find out how many alpha caracters present in a string
        String given="wefeqf87897979fewfewrf879797efds&^&^*^*^";

        String replaced=given.replaceAll ("[^A-Za-z]","");
        System.out.println (replaced.length ());
    }

}
