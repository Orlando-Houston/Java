package Udemy;

public class MethodArguments {
    int getZero(){//0 arguments(niladic)
        return 0;
    }
    int increment(int number){//1 argument (monadic)
        return number+1;
    }

    //parameter or argument  both same thing
    int sum(int a,int b){ return a+b;} //2 arguments (dyadic)


    int plusMinus(int a,int b,int c){return a+b-c;}//return 3 arguments(triadic)

    double average(double a,double b,double c,double d){return(a+b+c+d)/4.0;}
    //4 arguments(polyadic method)

  //  void test{}// doesn't compile  no brackets for arguments
  //  void test(int a;int b)//it dosn't compile because it must has coma not semicolon

    void test(int a,int b){ }

  //  void test2(int a);//missing  method body,doesn't compiler


}


