package ArraysAndStrings;

/**
 * Created by Pranav on 11/4/2017.
 */
public class _1_2 {
    public static boolean checkPermutation( String str1, String str2 ) {
        if(str1.length() != str2.length()) return false;

        int[] check = new int[128];
        for( int i = 0; i < str1.length(); i++ )
            check[str1.charAt(i)]++;
        for( int i = 0; i < str2.length(); i++ ) {
            check[str2.charAt(i)]--;
            if(str2.charAt(i) < 0)
                return false;
        } //slightly more optimized on the basis that check has no negative values
        return true;

        /*Previous Code for( int i = 0; i < str1.length(); i++ )
            check[str1.charAt(i)]--;
        int sum = 0;
        for(int i = 0; i < 128; i++)
            sum += check[i];

        return sum == 0;*/
    }

    /*If we need to solve this with O(1) space complexity
      you could turn each one into a char array, sort both,
      and then compare both but this would be O(nlog(n))
     */
}
