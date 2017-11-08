package ArraysAndStrings;

/**
 * Created by Pranav and his boy Cory on 11/4/2017.
 */
public class _1_4 {
    //taco cat is a palindrome
    static boolean palindromePermutation( String str ) {
        //REDO: go back over this and change it to store only letters and deal with capitals
        //can implement using hashmaps as well
        int[] charArr = new int[128]; //O(1) space
        for( int i = 0; i < str.length(); i++ ) {
            charArr[str.charAt(i)]++;
        }
        boolean one = false;
        for(int i = 0; i < 128; i++) {
            if( charArr[i] < 0 || charArr[i] > 2 )
                return false;
            if(charArr[i] == 1 && !one)
                one = true;
            else
                return false;
        }
        return true;
    }
}
