package node.practice;

import node.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :递归二叉树的序列打印练习题
 * @package :Node.practice
 * @Description :请用递归方式实现二叉树的先序、中序和后序的遍历打印。
 * 给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 * @date : 2017/3/6 14:01
 */
public class TreeToSequence {
    public int[][] convert(Node root) {
        List<Node> preList = new LinkedList<Node>();
        List<Node> inList = new LinkedList<Node>();
        List<Node> posList = new LinkedList<Node>();
        preOrder(root, preList);
        inOrder(root, inList);
        posOrder(root, posList);

        int size = preList.size();
        int sum[][] = new int[3][size];
        for (int i = 0; i < size; i++) {
            sum[0][i] = preList.get(i).value;
            sum[1][i] = inList.get(i).value;
            sum[2][i] = posList.get(i).value;
        }
        return sum;
    }

    void preOrder(Node root, List<Node> nodeList) {
        if (root == null) return;
        nodeList.add(root);
        preOrder(root.left, nodeList);
        preOrder(root.right, nodeList);
    }

    void inOrder(Node root, List<Node> nodeList) {
        if (root == null) return;
        inOrder(root.left, nodeList);
        nodeList.add(root);
        inOrder(root.right, nodeList);
    }

    void posOrder(Node root, List<Node> nodeList) {
        if (root == null) return;
        posOrder(root.left, nodeList);
        posOrder(root.right, nodeList);
        nodeList.add(root);
    }
}
