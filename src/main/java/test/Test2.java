package test;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test
 * @Description :${todo}
 * @date : 2017/3/3 22:31
 */
public class Test2 {
}
class NULL{
    public void setValue(String value) {
        this.value = value;
    }

    private String value = null;
    public void print(){
        System.out.println(String.format("%s", null));
    }
}
