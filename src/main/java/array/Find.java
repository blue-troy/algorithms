package array;

/**
 * Created by heyixin on 2017/3/23.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Find {
    public boolean Find(int target, int[][] array) {
        int n = array.length;//行
        int m = array[0].length;//列
        //从左下角开始查找 上比自己小，右比自己大
        int i = n - 1, j = 0;
        while (i >= 0 && j <= m - 1) {
            if (array[i][j] == target) return true;
            else if (array[i][j] > target) i--;
            else j++;
        }
        return false;
    }
}
