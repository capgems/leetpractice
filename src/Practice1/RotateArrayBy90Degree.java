/*
public class RotateArrayBy90Degree {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int a1[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        //  rotate(a1, 3);// should return:
        // [[7, 4, 1],
        //  [8, 5, 2],
        //  [9, 6, 3]]

        int a2[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        // rotate(a2, 4); // should return:
        // [[13, 9, 5, 1],
        //  [14, 10, 6, 2],
        //  [15, 11, 7, 3],
        //  [16, 12, 8, 4]]
    }

    public static int[] rotateMatrix(int[][] arr, int matrixSize) {
        for(int i=0; i< (matrixSize /2 + matrixSize % 2); i++ ){
         for(int j=0; j< matrixSize /2; j++){
             int[] tmp = new int[4];
             int currentI = i;
             int currentJ = j;
             for(int k=0; k < 4; k++){
                tmp[k] = arr[currentI][currentJ];
                int [] newOrdinates = newCoordinates(currentI, currentJ, matrixSize);
                currentI = newOrdinates[0];
                currentJ = newOrdinates[1];
             }

             for(int k=0; k<4; k++){

             }
         }

       }
    }

    public static int[] newCoordinates(int i, int j, int n) {
        int[] newOrdinates = new int[2];
        newOrdinates[0] = j;
        newOrdinates[1] = n - 1 - i;
        return newOrdinates;
    }
}
*/
