package sort.practice;

import java.util.Arrays;

import static test.abstractAndInter.InterTest.a;

/**
 * Created by heyixin on 2017/3/11.
 */
public class Sort {
    //选择 冒泡 插入 时间复杂度为 n*n

    //冒泡
    int[] bubbleSort(int[] A, int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = A[j];
                }
            }
        }
        return A;
    }

    //选择
    public int[] selectionSort(int[] A, int n) {
        // write code here
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) if (A[min] > A[j]) min = j;//把选到的最小的数跟i交换
            temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
        return A;
    }

    //插入排序  把右边无序的插入到左边有序的位置中
    public int[] insertionSort(int[] A, int n) {
        // write code here
        int temp = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && A[j - 1] > A[j]; j--) {
                temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
        }
        return A;
    }

    //归并排序
    public int[] mergeSort(int[] A, int n) {
        // write code here
        sort(A, 0, n - 1);
        return A;
    }

    private void sort(int[] data, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(data, left, mid);
        sort(data, mid + 1, right);
        merge(data, left, mid, right);
    }

    private void merge(int[] data, int left, int mid, int right) {
        //复制数组
        int copy[] = new int[right - left + 1];
        for (int i = left; i <= right; i++) copy[i] = data[i];

        int i = left, j = mid + 1;
        for (int k = i; k <= right; k++) {
            if (i > mid) data[k] = copy[j++];//左边用尽取右边
            else if (j > right) data[k] = copy[i++];//右边用尽取左边
            else if (copy[i] < copy[j]) data[k] = copy[i++];//哪个小取哪个
            else data[k] = copy[j++];
        }
    }

    //快速排序
    public int[] quickSort(int[] A, int n) {
        // write code here
        quick(A, 0, n - 1);
        return A;
    }

    private void quick(int[] a, int low, int height) {
        if (low >= height) return;
        int mid = partition(a, low, height);
        quick(a, low, mid);
        quick(a, mid + 1, height);
    }

    private int partition(int[] a, int low, int height) {
        int key = a[low];
        while (low < height) {
            while (a[height] >= key && height > low) height--;
            a[low] = a[height];
            while (a[low] <= key && height > low) low++;
            a[height] = a[low];
        }
        a[height] = key;

        return height;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 8, 0, 43, 76, 89, 23, 65};
        Sort sort = new Sort();
        a = sort.mergeSort(a, 10);
        System.out.println(Arrays.toString(a));

    }
}
