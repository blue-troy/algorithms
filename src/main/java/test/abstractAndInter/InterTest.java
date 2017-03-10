package test.abstractAndInter;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test.abstractAndInter
 * @Description :${todo}
 * @date : 2017/3/8 10:27
 */
public interface InterTest {
    int anInt = 0; //Java接口中声明的变量默认都是static final的
    int a = 0;
    void hey();//抽象 Java接口中的成员函数默认是public的
//    接口是绝对抽象的，不可以被实例化。抽象类也不可以被实例化，但是，如果它包含main方法的话是可以被调用的。
}
