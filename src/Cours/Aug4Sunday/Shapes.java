package Cours.Aug4Sunday;

public class Shapes {
    char symbol;
    int height;
    int width;

    Shapes() {
        this.symbol = '*';
        this.height = 7;
        this.width = 7;
    }
    Shapes(char symbol, int height, int width) {
        this.symbol = symbol;
        this.height = height;
        this.width = width;
    }
    public void printPyramid() {
        int n=1;
        for(int i=0; i<height; i++) {
            for (int j=height-i; j>1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<n+i; j++) {
                System.out.print(this.symbol);
            }
            System.out.println();n++;
        }
    }
    public void printRectangle() {
        for (int i=0; i<this.height; i++){
            for (int j=0; j<this.width; j++) {
                System.out.print(this.symbol+" ");
            }
            System.out.println();
        }
    }
    public void printRectangle(char symbol, int height, int width) {
        for (int i=0; i<height; i++){
            for (int j=0; j<width; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }


public static void main(String[] args) {
        Shapes myShape = new Shapes();
        // System.out.println(myShape.symbol);

        myShape.printPyramid();
        System.out.println();
        myShape.printRectangle();
        System.out.println();
        myShape.printRectangle('$',9,18);
        Shapes myShape2 = new Shapes('@',10,10);
        myShape2.printRectangle();
        myShape2.printPyramid();
        Shapes myShape3 = new Shapes('8',5,5);
        myShape3.printRectangle();
        myShape3.printPyramid();
        }
}
