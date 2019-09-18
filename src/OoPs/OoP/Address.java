package OoPs.OoP;

public class Address {
    //Attribute
    int streetNum;
    String city;
    String state;
    String country;
    Address(int streetNum,String c,String s,String count){  // constructor

        this.streetNum=streetNum;
        this.city=c;
        this.state=s;
        this.country=count;
    }
}
    class StudentClass{
        int rollNum;
        String studentName;
        // creating Has-A relationship with address class
        Address studentAddr;
        StudentClass(int roll,String name,Address Addr) {
            this.rollNum = roll;
            this.studentName = name;
            this.studentAddr = Addr;
        }

        public static   void main(String[] args) {
            Address ad = new Address(1127, "houston", "arum", "U.S.A");
            StudentClass obj = new StudentClass(259, "Altun", ad);
            System.out.println(obj.rollNum);
            System.out.println(obj.studentName);
            System.out.println(obj.studentAddr.streetNum);
            System.out.println(obj.studentAddr.city);
            System.out.println(obj.studentAddr.state);
            System.out.println(obj.studentAddr.country);
        }

        }
        class College {
    String collegeName;
    //Creating Has-A relationship with address class
            Address collegeAddr;
            College(String name,Address addr){
                this.collegeName=name;
                this.collegeAddr=addr;

            }

        }
        class Staff{
    String employeeName;
    //creating Has-a relationship with address class

            Address employeeAddr;
            Staff(String name,Address addr){
                this.employeeName=name;
                this.employeeAddr=addr;
            }
        }



















