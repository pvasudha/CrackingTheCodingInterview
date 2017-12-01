package ArraysAndStrings;

/**
 * Created by Pranav on 11/16/2017.
 */
public class palin {
    boolean palin1( String str ) {
        str = str.replaceAll( "[^a-zA-Z0-9]", "" ).toLowerCase(); //O(n)

        int len = str.length();
        for( int i = 0; i < len / 2; i++ ) {
            if( str.charAt(i) != str.charAt(len - i - 1) )
                return false;
        }
        return true;
    }
}
