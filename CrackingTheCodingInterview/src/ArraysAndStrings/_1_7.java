package ArraysAndStrings;

/**
 * Created by Pranav on 11/4/2017.
 */
public class _1_7 {
    //INCORRECT SOLUTION LOL
    static void rotateMatrix( int[][] arr ) { //in-place solution (has to be nxn)
        for( int i = 0; i < arr.length / 2; i++ ) {
            for( int j = 0; j < arr.length; j++ ) {
                //top right to top left
                int temp = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = arr[i][j];
                //top left to bottom left
                int temp2 = arr[arr.length - 1 - i][arr.length - 1 -j];
                arr[arr.length - 1 - i][arr.length - 1 - j] = temp;
                //bottom left to bottom right
                temp = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp2;
                //top right to top right
                arr[i][j] = temp;

            }
        }
    }
}
