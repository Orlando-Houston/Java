package Abstract;

public class Triangle extends GeometricalShapes {
    private double height;
    private double base;

    public void features( double height,double base){
        this.height=height;
        this.base=base;
    }

    @Override
    public double calculateArea() {
        return (height*base)/2;
    }
}
