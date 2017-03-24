package dynamicPlanning;

import org.junit.Test;

/**
 * Created by heyixin on 2017/3/23.
 */
public class VisitTest {

    @Test
    public void countPath() throws Exception {
        Visit visit = new Visit();
        int[][] test = {{0, 1, 0}, {2, 0, 0}};
        int result = visit.countPath(test, 2, 3);
        System.out.println(result);
    }

}