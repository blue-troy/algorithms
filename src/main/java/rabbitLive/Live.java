package rabbitLive;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :PACKAGE_NAME
 * @Description :有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少?
 * 兔子的规律为数列：1, 1, 2, 3, 5, 8, 13, 21 ....
 * @date : 2017/3/3 20:51
 */
public class Live {
    public static int Solution(int month) {
        if (month==1||month==2) return 1;
        int[] count = new int[100];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i < month; i++) {
            count[i] = count[i - 1] + count[i - 2];
        }
        return count[month-1];
    }
}
