package sort.impl;

import sort.Sort;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :插入排序
 * @package :sort
 * @Description :类似于整理桥牌,把右边无序的部分插入到左边有序部分的相对位置
 * 时间复杂度:N^2 比选择排序快一倍
 * @date : 2017/1/19 23:24
 */
public class Insertion extends Sort {

    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            //从右往左找到自己的位置
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) exchange(a, i, j);
        }
    }
}

