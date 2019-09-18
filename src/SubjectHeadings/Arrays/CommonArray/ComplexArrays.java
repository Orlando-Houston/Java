package SubjectHeadings.Arrays.CommonArray;

public class ComplexArrays {
    private void multiDimensionalArrayTest() {
        int[][] numberArray = {
                {0},
                {1,2},
                {3,4,5},
                {6,7,8,9},
        };
    }

    private void intArrayPrinter(int[][] intArray) {
        int rowSize = intArray.length;
        for(int row=0; row<rowSize; row++) {
            int columnSize = intArray[row].length;
            for(int column=0; column<columnSize; column++) {
                System.out.println("int[" + row + "][" + column + "]: " + intArray[row][column]);
            }
        }
    }
}
