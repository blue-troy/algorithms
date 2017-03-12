package dynamicPlanning;

/**
 * Created by heyixin on 2017/3/11.
 * 有一个矩阵map，它每个格子有一个权值。从左上角的格子开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，返回所有的路径中最小的路径和。
 * 给定一个矩阵map及它的行数n和列数m，请返回最小路径和。保证行列数均小于等于100.
 */
public class MinimumPath {
    public int getMin(int[][] map, int n, int m) {
        // write code here
        if (map == null) return 0;
        int[][] dp = new int[n][m];
        dp[0][0] = map[0][0];

        //初始化第一行dp
        for (int i = 1; i < m; i++) {
            dp[0][i] = map[0][i] + dp[0][i - 1];
        }
        //初始化第一列dp
        for (int i = 1; i < n; i++) {
            dp[i][0] = map[i][0] + dp[i - 1][0];
        }
        //动态规划
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = map[i][j] + Math.min(dp[i - 1][j], dp[i][j-1]);
            }
        }

        return dp[n-1][m-1];
    }
}
