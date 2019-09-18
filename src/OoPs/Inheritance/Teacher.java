package OoPs.Inheritance;

public class Teacher {
    String designation="Teacher";
    String CollegeName="N.A.U";
    void does(){
        System.out.println("Teaching");
    }
}
 class geographyTeacher extends Teacher{
    String mainSubject="Geography";

    public static void main(String[] args) {
        geographyTeacher obj=new geographyTeacher();
        System.out.println(obj.CollegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
    }
}
