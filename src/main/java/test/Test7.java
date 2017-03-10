package test;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test
 * @Description :${todo}
 * @date : 2017/3/8 16:33
 */
public class Test7 {
    Integer integer;

    public static void main(String[] args) {
        Test7 test7 = new Test7();
        test7.change(test7);
        System.out.println(test7.integer);
    }

    void change(Test7 test7) {
        test7.integer = 7;
    }
}
