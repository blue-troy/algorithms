package tree.order;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :tree.order
 * @Description :${todo}
 * @date : 2017/3/3 14:49
 */
public class PrintBiTree {
    public int[][] printBiTree(BiTree root) {
        Queue<BiTree> queue = new LinkedList<>();
        queue.add(root);
        BiTree lastNode = root;     //当前行最右节点
        BiTree nLastNode = root;    //下一行最右节点
        BiTree currentNode = root;  //当前节点
        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            System.out.println(currentNode.val);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
                nLastNode = currentNode.left;
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
                nLastNode = currentNode.right;
            }

            if (lastNode == nLastNode) {
                lastNode = nLastNode;
                System.out.println();
            }
        }
        int[][] hehe = {{2, 1}};
        return hehe;
    }
}
