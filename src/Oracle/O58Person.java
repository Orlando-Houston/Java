package Oracle;

public class O58Person {

    private String name;
    private int age=25;

    public O58Person(String name){   //const   with parameter
      // this()      //line n1
      //  setName ();



    }
    public O58Person(String name,int age){    //another constructor
      //  O58Person(name);     // line n2
       // setAge ();

    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String show(){   //  method
        return getName () +" "+ getAge () +" ";//+number;

    }

    public static void main(String[] args) {
        O58Person p1=new O58Person ("jess");
        O58Person p2=new O58Person ("Walter",52);
        System.out.println (p1.show ());
        System.out.println (p2.show ());
    }


}

//compiler error  n1 and n2
