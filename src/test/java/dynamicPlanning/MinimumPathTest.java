package dynamicPlanning;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heyixin on 2017/3/11.
 */
public class MinimumPathTest {
    @Test
    public void getMin() throws Exception {
        int result = new MinimumPath().getMin(new int[][]{{1, 2, 3}, {1, 1, 1}}, 2, 3);
        System.out.println(result);
    }

}