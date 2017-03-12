package dynamicPlanning;

/**
 * Created by heyixin on 2017/3/11.
 * 有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法。为了防止溢出，请将结果Mod 1000000007
 * 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
 */
public class GoUpstairs {
    public int countWays(int n) {
        int f1 = 1;//台阶1
        int f2 = 2;//台阶2
        if (n == 1) return f1;
        for (int i = 3; i <= n; i++) {
            int temp = (f1 + f2) % 1000000007;
            f1 = f2;
            f2 = temp;
        }
        return f2;
    }
}
