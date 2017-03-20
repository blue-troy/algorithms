package array;

import org.junit.Test;

/**
 * Created by heyixin on 2017/3/20.
 */
public class LongestDistanceTest {
    @Test
    public void getDis() throws Exception {
        LongestDistance longestDistance = new LongestDistance();
        int n = longestDistance.getDis(new int[]{10, 5}, 2);
        System.out.println(n);
    }

}