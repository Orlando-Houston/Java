package SubjectHeadings.MethodFerhat;

public class NonParameterReturnValue1 {
    public static void main(String[] args) {

        boolean situation=comparison();
        System.out.println("Comparision:"+situation);

    }

    public static boolean comparison() {
        int a=10;
        int b=15;
        if (a>b){
            return true;
        }
        else {
            return false;
        }



    }
}
