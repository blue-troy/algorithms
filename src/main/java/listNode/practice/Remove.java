package listNode.practice;

import listNode.ListNode;

/**
 * Created by heyixin on 2017/3/18.
 */
public class Remove {
    public boolean removeNode(ListNode pNode) {
        // write code here

        //1 if pNode is the last one return false
        if (pNode.next == null) return false;
        //2 else remove node
        pNode.val = pNode.next.val;
        ListNode temp = pNode.next;
        pNode.next = pNode.next.next;
        temp = null;
        return true;
    }
}
