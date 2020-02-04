package Oracle;

public class PersonOracle103 {
  //  field ,properties,variable
    String name;
    int age=25;

    public PersonOracle103(String name){//constructor
      //  this();//line 1
        setName(name);

    }
    public PersonOracle103(String name, int age){
      //  Person103(name);//line 2
        setAge(age);
    }
    public void setName(String name){
        this.name=name;///properties teki name i set metoduna assign ediyorum...
    }
    public String getName(){   //return olacak bir fonksiyon yazdim//name degerini dondurecegim
        return  name;

    }
    public void  setAge(int age){
        this.age=age;



    }
    public int getAge(){
        return age;
    }
    public String show(){
        return name+" "+age ;
    }

    public static void main(String[] args) {
        PersonOracle103 p1=new PersonOracle103 ("Mike");
        PersonOracle103 p2=new PersonOracle103 ("Jessica",52);
        System.out.println (p1.show ());
        System.out.println (p2.show ());
    }

}
//compilation error line1  and line2




