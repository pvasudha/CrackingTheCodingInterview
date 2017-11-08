package TreesAndGraphs;

/**
 * Created by Pranav on 11/7/2017.
 */
import java.util.*;
// TreeMap is a self balancing Red-Black tree which means always O(logn) where logn is height of tree for all operations
public class TreeMapDemo {

    public static void main(String args[]) {
        // Create a hash map
        TreeMap tm = new TreeMap();

        // Key, Value
        // Put elements to the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set set = tm.entrySet(); //returns set of keys
        Collection v = tm.values(); //returns set of values

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = ((Double) tm.get("Zara")).doubleValue();
        tm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + tm.get("Zara"));
    }

    /* Object firstKey() returns lowest key
       Object get(key) returns object w/key
       remove(key)
     */
}