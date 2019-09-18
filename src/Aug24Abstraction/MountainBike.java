package Aug24Abstraction;

public class MountainBike extends Bicycle{
    String tireType;
    int seatHeight;
    int speed;
    MountainBike(String tireType,int seatHeight,int speed){
        this.tireType=tireType;
        this.seatHeight=seatHeight;
        this.speed=speed;
    }
    //method yazilana kadar baslik kirmizi gorunecek


    @Override
    void slowDown() {
        if (this.speed>0){
            this.speed=this.speed-1;
        }
    }

    @Override
    void speedUp() {
        this.speed=this.speed+1;
    }
    void speedUp( int increase){      //overloading
        this.speed=this.speed+increase;

    }
    void slowDown(int decrease){      //overloading
        if (this.speed>0){
            this.speed=this.speed-decrease;
        }

    }
}
