package Cours.Jul13;

public class HourGlassWithWhile {
    public static void main(String[] args) {
        int lines=1;
        while(lines<8){
            int spaces=1;
            //to print space
            while (spaces<lines){
                System.out.print("-");
                spaces++;



        }
        //to print numbers
        int numbers=lines;
        while(numbers<8) {
            System.out.print(numbers+" ");
            numbers++;
        }
        System.out.println();
        lines++;
    }

}
}
