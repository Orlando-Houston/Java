package Abstract;

public abstract class OrAbstractPlanet {
    protected void revolve(){ }    //line n1

   abstract void rotate();    //line n2


}
class Earth extends OrAbstractPlanet{
   // void revolve(){ }      //line n3 problem solved is public or protected

protected void rotate(){     // line n4

}}
