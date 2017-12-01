package ArraysAndStrings;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Pranav on 11/9/2017.
 */
/*
Find the first index of the substring. Condition: Do not  use java library function or regular expressions.
And measure the performance of your implementation with the standard java library function.
Examples: String 1: “abcdefg” String 2: “bcd” Should return 1 String 1: “abcdefg” String 2: “x” Should return -1
 */
public class firstIndex {
    static int firstIndex2(String str1, String str2) {
        if(str1.length() < str2.length()) {
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }

        int index = 0;
        for(int i = 0, count = 0; i < str1.length(); i++, count++) {
            if(count == str2.length() - 1)
                return index;
            else if(str1.charAt(i) == str2.charAt(count)) {
                if (count == 0)
                    index = i;
            }
            else
                count = -1;
        }
        return -1;
    }
    public static void main(String args[]) {
        System.out.println(firstIndex2("aabcdefg", "bcd"));
    }
}
