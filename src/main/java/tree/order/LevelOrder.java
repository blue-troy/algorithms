package tree.order;

import java.util.LinkedList;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :二叉树层次遍历
 * @package :tree.order
 * @Description :根据层次遍历的顺序，每一层都是从左到右的遍历输出，借助于一个队列。
 * 先将根节点入队，当前节点是队头节点，将其出队并访问，如果当前节点的左节点不为空将左节点入队，如果当前节点的右节点不为空将其入队。所以出队顺序也是从左到右依次出队。
 * @date : 2017/3/2 13:07
 */
public class LevelOrder {
    public void levelIterator(BiTree root) {
        if (root == null) {
            return;
        }
        LinkedList<BiTree> queue = new LinkedList<BiTree>();

        BiTree current = null;
        queue.offer(root);//将根节点入队
        while (!queue.isEmpty()) {
            current = queue.poll();//出队队头元素并访问
            System.out.println(current.val);
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    class BiTree {
        int val;
        BiTree left;
        BiTree right;
    }

}
