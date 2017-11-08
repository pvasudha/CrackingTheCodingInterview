package ArraysAndStrings;

/**
 * Created by Pranav on 11/4/2017.
 */
public class _1_5 {
    static boolean oneAway( String str1, String str2 ) {
        if( Math.abs(str1.length() - str2.length()) > 1 ) return false;
        //CAN merge this into one method by adding a check for if the lengths are equal or not inside

        //check for insert or delete a character
        boolean c = false;
        for( int i = 0, count  = 0; i < str1.length(); i++, count++ ) {
            if( str1.charAt(i) != str2.charAt(count) && !c ) {
                if( str1.length() < str2.length() )
                    i++;
                else
                    count++;
                c = true;
            }
            else if( str1.charAt(i) != str2.charAt(count) )
                return false;
        }

        //do a better job of checking for unnecessary code (old below)
        boolean foundDifference = false;
        for( int i = 0; i < str1.length(); i++ ) {
            if( str1.charAt(i) != str2.charAt(i) ) {
                if(foundDifference)
                    return false;
                foundDifference = true;
            }
        }
        //check for replace a character
        /*boolean foundDifference = false;
        for( int i = 0, count  = 0; i < str1.length(); i++, count++ ) {
            if( str1.charAt(i) != str2.charAt(count) && !foundDifference ) {
                i++;
                count++;
                foundDifference = true;
            }
            else if( str1.charAt(i) != str2.charAt(count) )
                return false;
        }*/
        return true;
    }
}
