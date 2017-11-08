package TreesAndGraphs;

/**
 * Created by Pranav on 11/7/2017.
 */
//OK implementation
class Node2<T extends Comparable<T>> {
    private T value;
    private Node2<T> left;
    private Node2<T> right;

    public Node2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

public class BinarySearchTree<T extends Comparable<T>> {
    private Node2<T> root;

    public BinarySearchTree(T value) {
        root = new Node2<T>(value);
    }

    public void insert(T value) {
        Node2<T> node = new Node2<T>(value);
        // insert logic goes here to search and insert
    }
}