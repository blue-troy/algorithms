package listNode.practice;

import listNode.ListNode;

/**
 * Created by heyixin on 2017/3/18.
 * 有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。
 * <p>
 * 给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值。
 * <p>
 * 测试样例：
 * [1,3,4,5,7],[1,2,3,4,0],2
 * 返回：{1,2,3,4,5,7}
 */
public class InsertValue {
    public ListNode insert(int[] A, int[] nxt, int val) {
        // write code here
        //1 构造循环链表
        //1.1 特殊情况处理
        if (A == null || A.length == 0) {
            ListNode listNode = new ListNode(val);
            return listNode;
        }
        //1.2构造
        ListNode head = new ListNode(A[0]);
        ListNode current = head;
        ListNode nextOne;
        for (int i = 0; i < nxt.length - 1; i++) {
            nextOne = new ListNode(A[nxt[i]]);
            current.next = nextOne;
            current = nextOne;
        }

        //2 insert

        current = head;
        ListNode toBeInsert = new ListNode(val);

        //2.2 val< minOf tHE listNode
        if (val <= head.val) {
            toBeInsert.next = head;
            return toBeInsert;
        }

        //2.1 normal insert
        while (current.next != null) {
            if (current.val <= val && val <= current.next.val) {
                //insertImpl
                toBeInsert.next = current.next;
                current.next = toBeInsert;
                return head;
            }
            current = current.next;
        }

        //2.3 val > maxOf the listNode
        current.next = toBeInsert;
        return head;

    }
}
