package sort;

import org.junit.Test;
import sort.impl.Selection;


/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :sort
 * @Description :${todo}
 * @date : 2017/1/18 21:48
 */
public class SelectionTest {
    String[] a = {"dsf", "a", "1", "454"};

    @Test
    public void sort() throws Exception {
        Selection.sort(a);
        assert Selection.isSorted(a);
        Selection.show(a);
    }

}