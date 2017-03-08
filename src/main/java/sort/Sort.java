package sort;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :sort
 * @Description :${todo}
 * @date : 2017/1/18 21:29
 */
public abstract class Sort {

    public static void sort(Comparable[] a) {
    }

    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + "  ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) if (less(a[i],a[i-1])) return false;
        return true;
    }
}
