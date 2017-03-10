package test;

/**
 * Created by heyixin on 2017/3/9.
 */
public class Test6 {
    public static void main(String[] args) {
        //低精度向高精度可以直接转换 高精度向低精度就要强制转换丢失精度
        int a =10;
        float b = a;
        a = (int) b;

        AA aa = new AA();
        BB bb = (BB) aa;
        aa = bb;
    }

}
class AA{}
class BB extends AA{}
