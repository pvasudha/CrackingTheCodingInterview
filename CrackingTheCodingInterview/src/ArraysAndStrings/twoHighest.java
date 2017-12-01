package ArraysAndStrings;

/**
 * Created by Pranav on 11/9/2017.
 */
public class twoHighest {
    static int[] method( int[] arr ) {
        if(arr.length <= 2)
            return arr;

        int[] res = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int a : arr) {
            if (res[1] < a) {
                res[0] = res[1];
                res[1] = a;
            }
        }
        System.out.println(res[0] + ", " + res[1]);
        return res;
    }

    public static void main(String args[]) {
        method(new int[]{1, 5, 9, 8, 7, 19, 4, 19});
    }
}
