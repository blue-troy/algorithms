package sort.utils;

import org.junit.Test;
import sort.sortType.SortType;

import static org.junit.Assert.*;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :sort.utils
 * @Description :${todo}
 * @date : 2017/1/20 18:12
 */
public class SortCompareTest {
    @Test
    public void timeRandomInput() throws Exception {
        double t1=SortCompare.timeRandomInput(SortType.Shell, 1000, 100);
        double t2=SortCompare.timeRandomInput(SortType.Insertion,1000, 100);
        System.out.println("shell/insertion=" +t1/t2);
    }

}