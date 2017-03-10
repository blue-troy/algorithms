package test.abstractAndInter;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test.abstractAndInter
 * @Description :${todo}
 * @date : 2017/3/8 18:41
 */

//不继承所有方法就出错了
public class Test extends AbstractTest {
    @Override
    void hey() {

    }

    @Override
    void AbstractTest() {

    }

}
class A{
    public static void main(String[] args) {
        Test test = new Test();
    }
}