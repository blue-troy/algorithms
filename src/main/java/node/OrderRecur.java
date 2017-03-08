package node;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :递归方式实现二叉树遍历
 * @package :Node
 * @Description :${todo}
 * @date : 2017/3/6 13:43
 */
public class OrderRecur {
    //前序遍历
    public static void preOrderRecur(Node head) {
        if (head == null) return;
        System.out.println(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    //中序遍历
    public static void inOrderRecur(Node head) {
        if (head == null) return;
        inOrderRecur(head.left);
        System.out.println(head.value + " ");
        inOrderRecur(head.right);
    }

    //后序遍历
    public static void posOrderRecur(Node head) {
        if (head == null) return;
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.value + " ");
    }

}
