package test;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test
 * @Description :${todo}
 * @date : 2017/3/3 21:40
 */
public class Test1 {
    public static void main(String[] args) {
        hehe();
    }
    static void hehe() {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if (s1 == s2)
            System.out.println("===succeed===");
        if (s1.equals(s2))
            System.out.println("===equals() succeed===");

    }

}
