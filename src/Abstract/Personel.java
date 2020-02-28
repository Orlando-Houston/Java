//soyut ana sinif bildirimi (bu sinifin lopyesi olusturulamaz)
package Abstract;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public  abstract class Personel {
    //variable
    public String name;
    public String lastName;
    public  int age;

    //soyut olmayan metod bildirimleri(kod icerir)
    public void setInformation(String name,String lastName,int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
    public abstract void printInformation();

}
class Teacher extends Personel{
    public  String branch;
    public String service;

    //Constructor method
    public Teacher(String name,String lastName,int age,String branch,String service){
        super.setInformation (name,lastName,age);
        this.branch=branch;
        this.service=service;
    }
    public void printInformation(){
        System.out.println ("Okulumuzun personeli:"+"Name"+name+"Soyadi:"+lastName+"Age");
        System.out.println ("Teacher:Branch:"+branch+"Hizmet yili:"+service);
    }
}
class MainPersonel{
    public static void main(String[] args) {
        //ogretmen sinifina ait degisken bildirimi
        Teacher teach=new Teacher ("Altun","Keskin",49,"Geograph","29");

        teach.printInformation ();
    }
}

