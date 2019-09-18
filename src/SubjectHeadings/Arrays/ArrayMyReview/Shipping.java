package SubjectHeadings.Arrays.ArrayMyReview;

public class Shipping {
    public static void main(String[] args) {
        System.out.println();
    }

    static double CalculateShipping(double weight,double volume,int distance,String gonderi){
        double price=0;
        int pointWeight=0;
        int pointVolume=0;
        if (weight>=1&&weight<=5){
            pointWeight=12;
        }
        else if(weight>=6&&weight<=12){
            pointWeight=29;
        }
        else if (weight>=13){
            pointWeight=50;
        }
        else{
            System.out.println("gecersiz weight");
        }
        if (volume>=5&&volume<=10){
            pointVolume=20;
        }
        else if (volume>=11&&volume<=20){
            pointVolume=45;

        }
        else{
            System.out.println("gecersiz volume");
        }
        if (gonderi.equals("urgent")){
            price=(pointWeight*pointVolume/11)*distance/100;
        }
        else{
            price=(pointVolume*pointWeight/5)*distance/100;
        }
        return price;
    }
}



