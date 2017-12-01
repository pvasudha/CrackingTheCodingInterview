package ArraysAndStrings;

/**
 * Created by Pranav on 11/16/2017.
 */
public class FizzBuzz {
    static void fizzBuzz( int n ) {
        for( int i = 1; i <= n; i++ ) {
            /*if (i % 3 == 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            if (i % 3 != 0 && i % 5 != 0)
                System.out.print(i);

            System.out.print("\n");*/
            boolean a = (i % 3 == 0), b = (i % 5 == 0);
            System.out.println(a & b ?"FizzBuzz": a ?"Fizz": b ?"Buzz": i);

        }
    }

    public static void main(String args[]) {
        //fizzBuzz(30);
        fizz(30);
    }







    static void fizz( int n ) {
        for( int i = 1; i <= n; i++ ) {
            /*if( i % 3 == 0 && i % 5 == 0 )
                System.out.println("FizzBuzz");
            else if( i % 3 == 0 )
                System.out.println("Fizz");
            else if( i % 5 == 0 )
                System.out.println("Buzz");
            else
                System.out.println( i );*/

            boolean a = ( i % 3 == 0 ), b = ( i % 5 == 0 );
            System.out.println( a & b ? "FizzBuzz" : a ? "Fizz" : b ? "Buzz" : i );

        }
    }

}
