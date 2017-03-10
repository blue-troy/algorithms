package test.abstractAndInter;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test.abstractAndInter
 * @Description :${todo}
 * @date : 2017/3/8 10:27
 */
public abstract class AbstractTest {
    int a;

    AbstractTest()//可以有构造方法
    {

    }

    //抽象类可以包含非final的变量。
    abstract void hey();//抽象

    void notAbstract() {
        System.out.println("not abstract");
    }

    abstract void AbstractTest();//抽象方法与之同名
}
