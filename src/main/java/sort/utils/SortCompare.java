package sort.utils;

import sort.impl.Insertion;
import sort.impl.Selection;
import sort.sortType.SortType;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :sort
 * @Description :${todo}
 * @date : 2017/1/20 14:25
 */
public class SortCompare {

    //为指定算法记时
    public static double time(SortType sortType, Comparable[] a) {
        long startTime = System.currentTimeMillis();
        switch (sortType) {
            case Insertion: Insertion.sort(a);
            case Selection: Selection.sort(a);
        }
        long StopTime = System.currentTimeMillis();
        return StopTime - startTime;
    }

    //生成随机数组测试类,对T个长度为N的数组进行sortType类型排序测试
    public static double timeRandomInput(SortType sortType, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) a[i] = StdRandom.uniform();
            total +=time(sortType,a);
        }
        return total;
    }
}
