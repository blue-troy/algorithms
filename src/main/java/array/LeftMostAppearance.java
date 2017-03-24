package array;

/**
 * Created by heyixin on 2017/3/23.
 * 对于一个有序数组arr，再给定一个整数num，请在arr中找到num这个数出现的最左边的位置。
 * 给定一个数组arr及它的大小n，同时给定num。请返回所求位置。若该元素在数组中未出现，请返回-1。
 * 测试样例：
 * [1,2,3,3,4],5,3
 * 返回：2
 */
public class LeftMostAppearance {
    public int findPos(int[] arr, int n, int num) {
        int res = -1;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < num) left = mid + 1;
            else if (num < arr[mid]) right = mid - 1;
            else if (num == arr[mid]) {
                res = mid;
                right = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeftMostAppearance leftMostAppearance = new LeftMostAppearance();
        System.out.println(leftMostAppearance.findPos(new int[]{1, 2, 3, 3, 4}, 5, 3));
    }
}