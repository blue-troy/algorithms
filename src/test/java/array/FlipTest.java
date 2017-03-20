package array;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by heyixin on 2017/3/20.
 */
public class FlipTest {
    @Test
    public void flipChess() throws Exception {
        Flip flip = new Flip();
        int[][] A = new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}};
        int[][] f = new int[][]{{2, 2}, {3, 3}, {4, 4}};
        A = flip.flipChess(A, f);
        System.out.println(Arrays.deepToString(A));
    }

}