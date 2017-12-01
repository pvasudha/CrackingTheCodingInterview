package TreesAndGraphs;

import ArraysAndStrings.HashTable;

/**
 * Created by Pranav on 11/8/2017.
 */
public class _4_5 {
    //you can inorder traverse and put the output into an array and check the array (suboptimal solution)

    int prev;
    boolean validateBST(TreeNode node) {
        return validateBST(node, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validateBST(TreeNode root, long minVal, long maxVal) {
        if (root == null)
            return true;
        if (root.value >= maxVal || root.value <= minVal)
            return false;
        return validateBST(root.left, minVal, root.value) && validateBST(root.right, root.value, maxVal);
    }
}

