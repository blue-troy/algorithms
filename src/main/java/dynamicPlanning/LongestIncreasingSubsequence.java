package dynamicPlanning;

/**
 * Created by heyixin on 2017/3/11.
 * 这是一个经典的LIS(即最长上升子序列)问题，请设计一个尽量优的解法求出序列的最长上升子序列的长度。
 * 给定一个序列A及它的长度n(长度小于等于500)，请返回LIS的长度。
 */
public class LongestIncreasingSubsequence {
    public int getLIS(int[] A, int n) {
        // write code here
        if (A==null) return 0;

        int[] dp = new int[n];
        int max = 0;//目前最长长度
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = getMax(i, A, dp) + 1;
            if (max < dp[i]) max = dp[i];
        }

        return max;
    }

    private int getMax(int i, int[] a, int[] dp) {
        int max = 0;
        for (int j = 0; j < i; j++) {
            if (a[j] < a[i] && dp[j] > max) max = dp[j];
        }
        return max;
    }
}
