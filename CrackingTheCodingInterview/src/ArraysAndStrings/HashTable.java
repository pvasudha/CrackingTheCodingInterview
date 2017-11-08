package ArraysAndStrings;

import LinkedLists.Node;

import java.util.ArrayList;

/**
 * HashMap and HashTable are very similar in Java
 * HashMap is newer and slightly more efficient but HashTables
 * are thread safe
 */

class HashNode<K, V> {
    K key;
    V value;
    HashNode<K, V> next;

    //constructor
    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

}

public class HashTable<K, V> {
    private ArrayList<HashNode<K,V>> bucketArray;
    //capacity of array list
    private int arrMax;
    //current size of array list
    private int size;

    //constructor
    public HashTable() {
        bucketArray = new ArrayList<HashNode<K, V>>();
        arrMax = 10;
        size = 0;

        for( int i = 0; i < arrMax; i++ )
            bucketArray.add(null);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //finds hash function to find index for key
    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs( hashCode % arrMax ); //Math/abs to handle
    }

    public V remove(K key) {
        int index = getIndex(key);
        HashNode<K,V> n = bucketArray.get(index);
        HashNode<K, V> prev = null;
        while( n != null ) {
            if( n.key == key )
                break;
            prev = n;
            n = n.next;
        }

        if( n == null ) //if key isn't there
            return null;

        if(prev != null)
            prev.next = n.next;
        else
            bucketArray.set(index, n.next); //it this line necessary

        size--;
        return n.value;
    }

    public V get(K key) {
        int index = getIndex(key);
        HashNode<K, V> n  = bucketArray.get(index);
        while( n != null ) {
            if( n.key == key )
                return n.value;
        }

        return null;
    }

    public void add(K key, V value) {
        int index = getIndex(key);
        HashNode<K, V> n = bucketArray.get(index);

        //checks if key already exists
        while(n != null) {
            if(n.key == key) {
                n.value = value;
                return;
            }
            n = n.next;
        }

        n = bucketArray.get(index);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = n;
        bucketArray.set(index, newNode);
        size++;

        //load factor greater than 70% (if more than 70% of buckets filled up)
        if( (1.0 / size) / arrMax >= 0.7 ) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<HashNode<K, V>>();
            arrMax *= 2;
            size = 0;
            for(int i = 0; i < arrMax; i++)
                bucketArray.add(null);
            for(HashNode<K, V> headNode: temp) { //adds every value again
                while(headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }

    }
}
