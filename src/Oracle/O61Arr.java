package Oracle;

public class O61Arr {
    public static void main(String[] args) {
        int[] array={10,15,25,40,50,65};
        array[2]=array[4];//it compiler
        array[4]=90;
        //{10,15,50,65,90}  result

    }

}
