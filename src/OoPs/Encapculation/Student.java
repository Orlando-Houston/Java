package OoPs.Encapculation;

public class Student {
   private String name;
   private String lastName;
   private int dateBirth;
    private String studentId;

    public Student(){

    }

public Student(String n,String l,int d,String id){
    name=n;
    lastName=l;
    dateBirth=d;
    studentId=id;
    }
    public void giveName (String n){
        if (n.length()<3){
            System.out.println("uygun olmayan isim girisi yapildi.var sayilan olarak kullanici atandi");
            name="user";
        }
        else{
            name=n;
        }

    }
    public void giveLastName (String l){
        if (l.length()<3){
            System.out.println("uygun olmayan soyisim girisi yapildi.varsayilan olarak ... atandi");
            lastName="zeynep";
        }
        else{
            lastName=l;
}
    }
    public void givedateBirth (int d){
        if (d<1900&& d>2017){
            System.out.println("uygun olmayan date a birth girisi yapildi.varsayilan olarak 0 atandi");
            dateBirth=d;

        }
    }
    public void studentIdGive ( String Id){
        if (Id.length()!=4){
            System.out.println("uygun olmayan student id girisi yapildi.varsayilan olarak 0 atandi");
            Id="0";

        }
        else{
            studentId=Id;

        }
    }




    }


