package AutomationUniversity;

public class RectangleClsAndObj {   //obje
    //    1       global variable   fields  properties
    double length;
    double width;
    //8
    public RectangleClsAndObj(){  //constructor  must be name same with class
        length=0;
        width=0;

    }
    //9
    public RectangleClsAndObj(double length,double width){//another constructors
       // this.length=length;
      //  this.width=width;   can be set this way  or

        setLength (length);//can be set this way
        setWidth (width);

    }

    double getLength(){  //4
        return length;
    }
    void setLength(double length){//5
        this.length=length;

    }

    double getWidth(){//6
        return width;
    }
    void setWidth(double width){//7
        this.width=width;

    }
    //2
    double calculatePerimeter(){  //method
        return (2*length)+(2*width);

    }
    //3
    double calculateArea(){  //method
        return length*width;

    }
}
