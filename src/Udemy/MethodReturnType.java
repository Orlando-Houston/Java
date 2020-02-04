package Udemy;

public class MethodReturnType {
    public void  jump(){}//return type void
    public void  jump2(){   //return type void
      return; //return is redundant We don't need return

    }
    public String jump3(){return "";}

  //  public  String jump4(){}//dosn't compile'no return statement

   // public jump5(){}// it dosn't compiler bucuse it hasn't return type


    String jump6(int a){
        if (a==5){
         //   return "";//it doesn't compiler
        }
        return"abc";
    }
    int getInt(){
        return 9;
    }
   // int getLong(){}
       // return 9L;//compiler error because  return type int  but value long

    int getLong(){
        return (int)9L;//inside parantesis  type casting
    }

    int expanded(){
     //   int temp=10;//dosn't need
      //  return temp;
        return 10;
    }
    boolean isTrue(){
      //  return 5<10;
        return 5==5;
    }
    public void test(){}
  //  public void 2test(){} dosn't compiler
 //   public void public(){}not compiler

    public void $Test(){}
    public void _test(){}

  //  public  void(){}





}
