package dynamicPlanning;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heyixin on 2017/3/11.
 */
public class LongestIncreasingSubsequenceTest {
    @Test
    public void getLIS() throws Exception {
        int result = new LongestIncreasingSubsequence().getLIS(new int[]{1, 4, 2, 5, 3}, 5);
        System.out.println(result);
    }

}