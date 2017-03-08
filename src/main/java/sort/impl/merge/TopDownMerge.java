package sort.impl.merge;

import sort.impl.merge.AbstractInPlaceMerge;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :自顶向下的递归并归排序
 * @package :sort.impl
 * @Description :${todo}
 * @date : 2017/2/5 11:28
 */
public class TopDownMerge extends AbstractInPlaceMerge {
    private static Comparable[] aux;//并归所需辅助数组

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a,aux,0,a.length-1);
    }


    private static void sort(Comparable[] a, Comparable[] aux,int lo, int hi) {
        if (hi<=lo) return;
        int mid = lo + (hi - lo) / 2;

        sort(a,aux,lo, mid);
        sort(a,aux, mid + 1, hi);
        merge(a,aux,lo,mid,hi);
    }

}
