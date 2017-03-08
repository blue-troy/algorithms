package test;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test
 * @Description :${todo}
 * @date : 2017/3/7 16:50
 */
public class TestClass2 {
    public static TestClass2 t1 = new TestClass2();
    public static TestClass2 t2 = new TestClass2();

    static {
        System.out.println("静态块");
    }

    {
        System.out.println("构造块");
    }

/*    void fuck() {
        static int a=1;
    }*/

    public static void main(String[] args) {
        TestClass2 t = new TestClass2();
    }
}
