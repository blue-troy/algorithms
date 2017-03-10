package test;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test
 * @Description :${todo}
 * @date : 2017/3/8 10:11
 */
public class Test6 {
    static int anInt;
    static Integer integer;
    public static void main(String[] args) {
        //静态变量在编译时就给了初始值
        System.out.println(anInt);
        System.out.println(integer);

        Integer integer1;
        int anInt1;
        //出错 普通变量必须自己赋初始值
//        System.out.println(integer1);
//        System.out.println(anInt1);
    }
}
