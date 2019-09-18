package OoPs.Abstract;

 class MountainBike extends Bicycle {
     String tireType;
     int seatHeight;
     int speed;
     MountainBike(String tireType, int seatHeight,int speed){
         this.tireType = tireType;
         this.seatHeight = seatHeight;
         this.speed = speed;
     }
     //
     void slowDown(){
         if(this.speed>0) {
             this.speed = this.speed - 1;
         }
     }
     void speedUp(){
         this.speed = this.speed+1;
     }
     void speedUp(int increase){
         this.speed = this.speed+increase;
     }
     void slowDown(int decrease){
         if(this.speed>0){
             this.speed = this.speed - decrease;
         }
     }
}
