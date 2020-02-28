package Abstract;

public class Rectangle extends GeometricalShapes {
    private  double longEdge;
    private  double shortEdge;
    public void  features(double longEdge,double shortEdge ){
        objectName ("rectangles ");
        this.longEdge=longEdge;
        this.shortEdge=shortEdge;
    }
    public double calculateArea(){
        return longEdge*shortEdge;
    }
}
