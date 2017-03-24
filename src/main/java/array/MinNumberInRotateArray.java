package array;

/**
 * Created by heyixin on 2017/3/23.
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
    //二分法
    public int minNumberInRotateArray(int[] array) {
        int low = 0;
        int height = array.length - 1;
        while (low <= height) {
            int mid = low + (height - low) / 2;
            //在右边
            if (array[mid] > array[height]) low = mid + 1;
            else if (array[mid] == array[height]) height--;
            else height = mid - 1;
        }
        return array[low];
    }

    public static void main(String[] args) {
        MinNumberInRotateArray minNumberInRotateArray = new MinNumberInRotateArray();
        int n = minNumberInRotateArray.minNumberInRotateArray(new int[]{4, 1, 2, 3, 3});
        System.out.println(n);
    }
}
