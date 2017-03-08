package sort.impl.merge;

import sort.Sort;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :原地并归排序
 * @package :sort.impl
 * @Description :并归排序：把两个有序数组合并成一个有序数组
 * @date : 2017/2/5 11:02
 */
public  class AbstractInPlaceMerge extends Sort{
    //把a[lo..mid],a[mid+1..hi]并归排序,假设了那两个数组为有序数组
    public static void merge(Comparable[] a, Comparable[] aux,int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) aux[k] = a[k]; //复制数组

        //并归数组
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++){
            if (i>mid) a[k] = aux[j++];//左边用尽取右半边元素
            else if (j>hi) a[k] = aux[i++];//右边用尽取左半边元素
            else if (less(aux[j],aux[i])) a[k] = a[j++];//哪个小取哪个
            else a[k] = aux[i++];
        }

    }
}
