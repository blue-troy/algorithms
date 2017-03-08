package sort.impl;

import sort.Sort;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :希尔排序
 * @package :sort.impl
 * @Description :分组进行插入排序，间隔分组
 * @date : 2017/1/20 15:00
 */
public class Shell extends Sort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h<N/3) h = 3 * h + 1; //增幅h
        while (h >= 1) {
            //插入排序
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j],a[j-h]); j -= h) exchange(a, j, j - h);
            }
            h=h/3;
        }
    }
}
