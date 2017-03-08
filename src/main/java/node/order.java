package node;

import java.util.Stack;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :二叉树的非递归遍历
 * @package :Node
 * @Description :${todo}
 * @date : 2017/3/6 13:47
 */
public class order {

    //前序遍历
    public void preOrder(Node head) {
        if (head == null) return;

        Stack<Node> stack = new Stack<Node>();
        stack.push(head);

        while (!stack.isEmpty()) {
            Node current = (Node) stack.pop();//中
            System.out.println(current);
            if (current.right != null) stack.push(current.right);//右
            if (current.left != null) stack.push(current.left);//左
        }

    }

    //中序遍历
    public void inOrder(Node head) {
        if (head == null) return;

        Stack<Node> stack = new Stack<Node>();
        Node current = head;
        stack.push(current);

        while (!stack.isEmpty()) {
            //左
            while (current != null) {
                current = current.left;
                if (current != null) stack.push(current);
            }
            //中
            current = stack.pop();
            System.out.println(current);
            //右
            current = current.right;
            if (current != null) stack.push(current);
        }

    }

    //后序遍历
    public void posOrder(Node head) {
        if (head==null) return;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        Node current = head;
        s1.push(head);

        while (!s1.isEmpty()) {
            current=s2.push(s1.pop());
            if (current.left!=null) s1.push(current.left);
            if (current.right!=null) s1.push(current.right);
        }
    }
}
