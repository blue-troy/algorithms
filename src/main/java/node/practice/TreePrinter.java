package node.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by heyixin on 2017/3/10.
 */
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        // write code here
        if (root == null) return new int[0][0];

        TreeNode last = root;
        TreeNode nLast = null;
        TreeNode current = null;

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        queue.add(root);
        //层次遍历
        while (!queue.isEmpty()) {
            current = queue.poll();
            arr.add(current.val);

            if (current.left != null) {
                queue.add(current.left);
                nLast = current.left;
            }
            if (current.right != null) {
                queue.add(current.right);
                nLast = current.right;
            }
            if (current == last) {
                last = nLast;
                ans.add(arr);
                arr = new ArrayList<Integer>();
            }
        }

        //动态数组二维化
        int[][] result = new int[ans.size()][];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = new int[ans.get(i).size()]; //需要指定二维中一纬的大小，因为非动态数组两个纬度都必须指定
            for (int j = 0; j < ans.get(i).size(); j++) {
                result[i][j] = ans.get(i).get(j);
            }
        }
        return result;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}