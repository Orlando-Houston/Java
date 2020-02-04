package Oracle;

public class CarTurk2 {
    //fields  ,properties
    private String color;
    private String model;
    private double engine;
    private int doors;
    //indirect acces  dolayli erisim

public void setCarProperties(String color,String model,double engine,int doors){  //for  to value
    this.color=color;
    this.doors=doors;
    this.model=model;
    this.engine=engine;


}
public String getColor(){
    return color;
}
public String getModel(){
    return  model;
}
public double getEngine(){
    return engine;
}
public int getDoors(){
    return doors;
}
public void start(){
    System.out.println ("Car engine started");
}
public void stop (){
    System.out.println ("Car stoped");

}

}

