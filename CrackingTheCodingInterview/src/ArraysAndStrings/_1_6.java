package ArraysAndStrings;

/**
 * Created by Pranav on 11/4/2017.
 */
public class _1_6 {
    public static void main( String args[] ) {
        System.out.println(stringCompression("ab"));
    }

    static String stringCompression( String str ) {
        /*If you check if you end up with shorter string
        upfront it is more code but you can optimize
        StringBuilder by initializing it to final length
        REVIEW THIS ONE (struggling with printing out remaining end)
         */
        StringBuilder res = new StringBuilder();
        //char prev = str.charAt(0);
        int count = 0;
        for( int i = 0; i < str.length(); i++ ) {
            count++;
            if( i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1) ) {
                res.append(str.charAt(i));
                res.append(count);
                count = 0;
            }
        }
        return res.length() < str.length() ? res.toString() : str;
    }
}
