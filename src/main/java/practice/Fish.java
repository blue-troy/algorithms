package practice;

import java.util.Scanner;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :practice
 * @Description :${todo}
 * @date : 2017/3/13 15:47
 */
public class Fish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSize = 0, maxSize = 0, n = 0;
        minSize = scanner.nextInt();
        maxSize = scanner.nextInt();
        n = scanner.nextInt();
        int[] fishSize = new int[n];
        for (int i = 0; i < fishSize.length; i++) {
            fishSize[i] = scanner.nextInt();
        }
        scanner.close();
        int count =0;
        count=countSolution(minSize,maxSize,n,fishSize);
        System.out.println(count);
    }

    public static int countSolution(int minSize, int maxSize, int n, int[] fishSize) {
        int size = minSize;
        int count = 0;
        while (size <= maxSize) {
            int i = 0;
            while (i < n && !((2 * fishSize[i] <= size && size <= 10 * fishSize[i]) || (2 * size <= fishSize[i] && fishSize[i] <= 10 * size))) {
                i++;
            }
            if (i == n) count++;
            size++;
        }
        return count;
    }
}
