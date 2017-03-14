package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :practice
 * @Description :${todo}
 * @date : 2017/3/14 10:39
 */
public class ContinuousInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        if (a.length == 1 && a[0] == 1) {
            System.out.println(a[0]+1);
            return;
        }

        if (a.length==1&&a[0]==1000000000){
            System.out.println(a[0]-1);
        }

        //先对数组进行排序
        int temp = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        //统计缺失
        int continuous = 0;
        List<Integer> notContinuous = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i]+2==a[i+1]) notContinuous.add(a[i]+1);
            if (a[i]+1==a[i+1]) continuous++;
        }
        boolean left = false;
        if (notContinuous.size()==0&&continuous==n-1) {
            if (a[0]!=1) {
                System.out.print(a[0] - 1);
                left = true;
            }
            if (a[n-1]!=1000000000) {
                if (left==true) System.out.print(" ");
                System.out.println(a[n - 1] + 1);
            }
        } else if (notContinuous.size()==1&&continuous==n-2) System.out.println(notContinuous.get(0));
        else System.out.println("mistake");
    }

}
