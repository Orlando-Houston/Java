package SubjectHeadings.MethodFerhat.MethodFunction;

public class Java1 {
    public static void main(String[] args) {

        System.out.println(sub(1,2));
        System.out.println(fact(5));
        System.out.println(usAl(1,4));

    }
    public static int sub(int a,int b){
        int total=a+b;
        return total;
    }
    public static int fact(int c){
        int f=1;
        for (int i=1;i<=c;i++){
            f=f*i;
        }
        return f;
    }
    public static int usAl(int base,int power){
        int result=1;
        for (int i=1;i<power;i++){
            result=result*base;

        }
        return result;


}
}
