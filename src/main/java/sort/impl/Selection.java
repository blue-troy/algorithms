package sort.impl;

import sort.Sort;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :选择排序
 * @package :sort
 * @Description :特点1:运行时间和输入无关 2:数据移动是最少的N次
 *时间复杂度:N^2
 * @date : 2017/1/18 21:03
 */
public class Selection extends Sort {

    public static void sort(Comparable[] a) {
        //升序排列
        for (int i = 0; i < a.length; i++) {
            int min = i;        //最小元素
            for (int j = i + 1; j < a.length; j++) if (less(a[j], a[min])) min = j;
            exchange(a, i, min);
        }
    }
}
