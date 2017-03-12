package node.practice;

import node.Node;

/**
 * Created by heyixin on 2017/3/12.
 */
public class MaxTree {
    public int findMaxSubTree(Node root) {
        return findMax(root, 0);
    }

    private int findMax(Node root, int result) {
        int sum = root.value;
        if (root.right != null || root.right != null) {
            int left = findMax(root.left, result);
            int right = findMax(root.right, result);

            sum += left + right;

            result = Math.max(sum, result);
        }
        return sum;
    }
}
