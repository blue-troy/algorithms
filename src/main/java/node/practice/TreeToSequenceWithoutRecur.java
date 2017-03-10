package node.practice;

import node.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :node.practice
 * @Description :${todo}
 * @date : 2017/3/8 15:21
 */
public class TreeToSequenceWithoutRecur {
    public int[][] convert(Node root) {
        List<Node> preList = new LinkedList<>();
        List<Node> inList = new LinkedList<>();
        List<Node> posList = new LinkedList<>();
        preOrder(root, preList);
        inOrder(root, inList);
        posOrder(root, posList);

        int sum[][] = new int[3][preList.size()];

        for (int i = 0; i < preList.size(); i++) {
            sum[0][i] = preList.get(i).value;
            sum[1][i] = inList.get(i).value;
            sum[2][i] = posList.get(i).value;
        }
        return sum;
    }

    //前序遍历
    private void preOrder(Node root, List<Node> list) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        Node current = root;
        while (!stack.isEmpty()) {
            //根
            current = stack.pop();
            list.add(current);
            //左右
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }

    //中序遍历
    private void inOrder(Node root, List<Node> list) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        Node current = root;

        while (!stack.isEmpty()) {
            //左
            while (current != null) {
                current = current.left;
                if (current != null) stack.push(current);
            }
            //根
            current = stack.pop();
            list.add(current);
            //右
            current = current.right;
            list.add(current);

        }
    }

    //后序遍历 双栈
    private void posOrder(Node root, List<Node> list) {
    }

}
