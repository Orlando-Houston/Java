package SubjectHeadings.PatternNumber;

public class LoopTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            for (int j=1; j<11; j++){
                if (j<+i){
                    System.out.print(j);

                }
            }
            System.out.println();
        }
    }
}
