package Udemy;

public class ArraysForEaechLoop {
    public static void main(String[] args) {
        String[]names={"Jimy","John","Tom","Anthony"};
        for (int i=0;i<names.length;i++){
            System.out.println ("name="+names[i]);
        }
        for (String name:names){
            System.out.println ("name="+name);
        }
        for (String name:names){
            name=name+" "+name; //gray is local variable intelli j never use
        }
        for (String name:names){
            System.out.println ("name="+name);
        }
        StringBuilder[]builders={
                new StringBuilder ("For"),
                new StringBuilder ("Loop")

        };
        for (StringBuilder builder:builders){
            System.out.println (builder);

        }
        for (StringBuilder builder:builders){
            builder.append ("123");
            System.out.println (builder);

        }

        for (StringBuilder builder:builders){
           System.out.println (builder);
        }

        String petss="parrot";
       // for (String pet:pets)//doesnt compile because It is string  needs array
      //  String[]pets="parrrot";//it doesnt  compile //need a initiliaze array{}
      //  for (int name:names){} //does not compile
        String [] pets={"parrot"};
        for (String pet:pets){
            System.out.println (pet);

            for (char c:petss.toCharArray ()){
                System.out.println (c);
            }
        }




    }}

