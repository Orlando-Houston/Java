package Abstract;

public class Circle extends GeometricalShapes {
    private double radius;
    private  double pi= Math.PI;
    public  void features(double radius){
        objectName ("Daire :");
        this.radius=radius;
    }
    public double calculateArea(){
        return pi*Math.sqrt (radius);
    }

}
