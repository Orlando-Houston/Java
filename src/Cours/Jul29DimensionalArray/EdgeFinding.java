package Cours.Jul29DimensionalArray;

public class EdgeFinding {
    public static void main(String[] args) {

    }

    public static void findAllEdges(int[][]image) {
        int[][]diffs=new int[image.length][image[0].length];
        for (int i=0;i<image.length;i++){
            for (int j=1;j<image[1].length;j++){
                diffs[i][j]=image[i][j]-image[i][j-1];
            }
        }

    }
}
