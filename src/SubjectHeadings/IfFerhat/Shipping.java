package SubjectHeadings.IfFerhat;

public class Shipping {
    public static void main(String[] args) {
        System.out.println(calculateShipping(11.3,14.7,500,"urgent"));
    }
    public static double calculateShipping(double weigth, double volume, int distance,String gonderi){
        double price = 0;
        int pointWeigth=0;
        int pointVolume=0;
        if(weigth>=1 && weigth<=5){
            pointWeigth=12;
        }
        else if(weigth>=6 && weigth<=12){
            pointWeigth=29;
        }
        else if(weigth>12){
            pointWeigth=50;
        }
        else {
            System.out.println("Gecersiz weigth");
        }
        if(volume>=5 && volume<=10){
            pointVolume=20;
        }
        else if(volume>=11 && volume<=20){
            pointVolume=45;
        }
        else {
            System.out.println("Gecersiz Volume");
        }
        if(gonderi.equals("urgent")){
            price = ((pointWeigth*pointVolume)/11)*distance/100;
        }
        else {
            price = ((pointVolume*pointWeigth)/5)*distance/100;
        }
        return price;
    }
}



