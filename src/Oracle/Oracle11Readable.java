package Oracle;

public interface Oracle11Readable {
    public void readBook();
    public void setBookMark();
}
abstract class Book implements Oracle11Readable{//line1
    public void readBook(){}
    //line2
}
class EBook extends Book{ //line3
    public void readBook(){}
    public void setBookMark(){}//problem solved by insert this part
    //line4


}
