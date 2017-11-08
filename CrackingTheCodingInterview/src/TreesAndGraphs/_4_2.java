package TreesAndGraphs;

class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    TreeNode( int v ) {
        this.value = v;
    }
}

//can wrap this with
class Tree {
    TreeNode root;
}

public class _4_2 {
    //given sorted array create BST with minimal height
    TreeNode createMinimalBST( int array[] ) {
        return createMinimalBST( array, 0, array.length - 1 );
    }

    TreeNode createMinimalBST( int array[], int start, int end ) {
        if( end < start )
            return null;

        int mid = ( start + end ) / 2;
        TreeNode n = new TreeNode( array[mid] );
        n.left = createMinimalBST( array, start, mid - 1 );
        n.right = createMinimalBST( array, mid + 1, end );

        return n;
    }
}
