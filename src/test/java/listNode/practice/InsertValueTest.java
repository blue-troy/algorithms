package listNode.practice;

import listNode.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heyixin on 2017/3/18.
 */
public class InsertValueTest {
    @Test
    public void insert() throws Exception {
        //[1,3,4,5,7],[1,2,3,4,0],2
        InsertValue insertValue = new InsertValue();
        ListNode head = insertValue.insert(new int[]{1,3,4,5,7},new int []{1,2,3,4,0},2);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}