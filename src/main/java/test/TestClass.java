package test;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test    静态块>main()>构造块>构造方法
 * @Description :访问顺序 父类的静态初始化块 子类静态初始化块 父类初始化块 子类初始化块 父类构造方法 子类构造方法. 但是静态初始化块只有一次
 * @date : 2017/3/7 16:40
 */
class B extends Object {
    {
        System.out.println("con b");
    }
    static {
        System.out.println("load b");
    }

    public B() {
        System.out.println("create b");
    }
}

class A extends B {
    {
        System.out.println("con a");
    }
    static {
        System.out.println("load a");
    }

    public A() {
        System.out.println("create a");
    }
}

public class TestClass {
    public static void main(String[] args) {
        new A();
        new A();
    }
}
