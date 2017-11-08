package TreesAndGraphs;

/**
 * Created by Pranav on 11/7/2017.
 */
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;
    BinaryTree(int key) {
        root = new Node(key);
    }
    BinaryTree() {
        root = null;
    }

}
