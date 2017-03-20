package array;

/**
 * Created by heyixin on 2017/3/20.
 * 有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
 * 给定数组A及它的大小n，请返回最大差值。
 */
public class LongestDistance {
    public int getDis(int[] A, int n) {
        // write code here
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[j] - A[i] > max) max = A[j] - A[i];
            }
        }
        return max;
    }
}


