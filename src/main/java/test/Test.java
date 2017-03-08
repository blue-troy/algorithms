package test;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test
 * @Description :${todo}
 * @date : 2017/3/3 21:36
 */
public class Test {
    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                print();
            }
        };
        t.run();
        System.out.print("MT");
    }

    static void print() {
        System.out.print("DP");
    }
}
