package ArraysAndStrings;

/**
 * Created by Pranav on 11/4/2017.
 */
public class _1_1 {
    public static void main(String args[]) {
        //TEST CASES
        String a = "abcddefg";
        System.out.println(a.charAt(2));
        System.out.println(a.substring(2, 3));

        System.out.println(isUniqueChar(a));
        System.out.println(isUnique(a));
    }

    public static boolean isUniqueChar( String input ) { //with additional data structure n can be arguable for O(1)
        if( input.length() > 128 )
            return false;

        boolean[] charTracker = new boolean[128];
        for( int i = 0; i < input.length(); i++ ) {
            int val = input.charAt(i);
            if(charTracker[val])
                return false;
            charTracker[val] = true;
        }
        return true;
    }
    //Can reduce space usage by factor of 8 in previous solution by using a bit vector

    //check on this solution for without an additional data structure
    public static boolean isUnique( String input ) {
        //n^2 without additional data structures (can use a sorting alg for nlog(n) if allowed to modify input)
        for( int i = 0; i < input.length(); i++ )
            if(input.substring(i + 1).contains(input.substring(i, i + 1)))
                return false;
        return true;
    }
}
