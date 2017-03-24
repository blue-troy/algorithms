package dynamicPlanning;

import java.util.Arrays;

/**
 * Created by heyixin on 2017/3/20.
 * 现在有一个城市销售经理，需要从公司出发，去拜访市内的商家，已知他的位置以及商家的位置，但是由于城市道路交通的原因，他只能在左右中选择一个方向，在上下中选择一个方向，现在问他有多少种方案到达商家地址。
 * 给定一个地图map及它的长宽n和m，其中1代表经理位置，2代表商家位置，-1代表不能经过的地区，0代表可以经过的地区，请返回方案数，保证一定存在合法路径。保证矩阵的长宽都小于等于10。
 * 测试样例：
 * [[0,1,0],[2,0,0]],2,3
 * 返回：2
 * “他只能在左右中选择一个方向，在上下中选择一个方向”应该理解为：左右中只能选一个方向，若选择左只能一直向左走。上下中只能选择一个方向，若选择下只能一直向下。
 */
public class Visit {
    public int countPath(int[][] map, int n, int m) {
        // write code here

        //1 找到经理和商家的位置
        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    x1 = i;
                    y1 = j;
                } else if (map[i][j] == 2) {
                    x2 = i;
                    y2 = j;
                }
            }
        }
        //2.1如果两点重合 直接返回1
        if (x1 == x2 && y1 == y2) return 1;
        //2.2 x1存放上面的
        if (x1 > x2) {
            x1 = x1 ^ x2 ^ (x2 = x1);
            y1 = y1 ^ y2 ^ (y2 = y1);
        }
        int[][] dp = new int[n][m];

        if (y1 < y2) {//2.3在主对角线上时
            dp[x1][y1] = 1;
            //第一列初始化
            for (int i = x1 + 1; i <= x2; i++) {
                dp[i][y1] = map[i][y1] == -1 ? 0 : dp[i - 1][y1];
            }
            //第一行初始化
            for (int i = y1 + 1; i <= y2; i++) {
                dp[x1][i] = map[x1][i] == -1 ? 0 : dp[x1][i - 1];
            }
            //建立dp矩阵
            for (int i = x1 + 1; i <= x2; i++) {
                for (int j = y1 + 1; j <= y2; j++) {
                    dp[i][j] = map[i][j] == -1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
                }
            }
        } else {//2.4在付对角线上

            dp[x1][y1] = 1;
            //第一列初始化
            for (int i = x1 + 1; i <= x2; i++) {
                dp[i][y1] = map[i][y1] == -1 ? 0 : dp[i - 1][y1];
            }
            //第一行初始化
            for (int i = y1 - 1; i >= y2; i--) {
                dp[x1][i] = map[x1][i] == -1 ? 0 : dp[x1][i + 1];
            }
            //建立dp矩阵
            for (int i = x1 + 1; i <= x2; i++) {
                for (int j = y1 - 1; j >= y2; j--) {
                    dp[i][j] = map[i][j] == -1 ? 0 : dp[i - 1][j] + dp[i][j + 1];
                }
            }
        }
        return dp[x2][y2];

    }
}
