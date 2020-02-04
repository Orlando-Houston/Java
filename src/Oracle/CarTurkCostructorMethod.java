package Oracle;

public class CarTurkCostructorMethod {
    //fields  ,properties
    public String color;
    public String model;
    public double engine;
    public int doors;


    public CarTurkCostructorMethod(String color,String model){
        this(color,model,0,0);
    }

    public CarTurkCostructorMethod(){//constructor overloading)   default
        //or
        /*
        this.color="dosn't have information";
        this.model="dosn't have information";
        this.engine=0;
        this.doors=0;

         */
        this("dosn't have information","dosn't have information",0,0);
   //this diyerek asagidaki const cagrildi
        //the following constructor was called saying this
    }


  //inside parantesis must fields
    public CarTurkCostructorMethod(String color,String model,double engine,int doors){//constructor method
        //I need  to fill in the method

        this.color=color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;
    }
    public void showInfos(){
        System.out.println ("Cars color:"+this.color);
        System.out.println (this.model);
        System.out.println (this.engine);
        System.out.println (this.doors);
    }
}
