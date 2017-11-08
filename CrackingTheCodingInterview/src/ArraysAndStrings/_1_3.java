package ArraysAndStrings;

/**
 * Created by Pranav on 11/4/2017.
 */
public class _1_3 {
    public static void main( String args[] ) {
        char[] in = new char[19];
        String a = "Mr John Smith";
        for( int i = 0; i < a.length(); i++ )
            in[i] = a.charAt(i);
        URLify(in ,13);
        System.out.println(in);
    }
    //slightly higher in difficulty
    static void URLify( char[] charStr, int size ) {
        //You can do anything in preparation as long as it's faster or equal to the bottleneck
        int spaceCount = 0;
        for( int i = 0; i < size; i++ )
            if(charStr[i] == ' ')
                spaceCount++;

        int countIndex = size + spaceCount*2 - 1; //*2 because there's already a char there
        for( int i = size - 1; i > 0; i -- ) {
            if ( charStr[i] == ' ' ) {
                charStr[countIndex--] = '0';
                charStr[countIndex--] = '2';
                charStr[countIndex--] = '%';
            }
            else
                charStr[countIndex--] = charStr[i];
        }
    }
}
