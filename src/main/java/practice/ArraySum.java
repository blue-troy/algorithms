package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by heyixin on 2017/3/14.
 */
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.close();

        for (int i = L; i < N; i++) {
            //奇数能整除情况
            if (i % 2 == 0 && N % i == 0) partingArrayDouble(N, i);
            //偶数且余0.5情况
            if (i % 2 != 0 && N % i == 0.5) partingArraySingle(N, i);
        }
    }

    private static void partingArraySingle(int n, int i) {
        int mode = n / i;
        int less = (1 - i) / 2;
        int[] array = new int[i];
        for (int j = 0; j < i; j++, less++) {
            array[j] = mode + less;
        }
        System.out.println(Arrays.toString(array));

    }

    private static void partingArrayDouble(int n, int i) {

    }
}
