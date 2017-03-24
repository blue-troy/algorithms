package string;

/**
 * Created by heyixin on 2017/3/23.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
       return str.toString().replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
}
