package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :practice
 * @Description :如果一个单词通过循环右移获得的单词，我们称这些单词都为一种循环单词。 例如：picture 和 turepic 就是属于同一种循环单词。 现在给出n个单词，需要统计这个n个单词中有多少种循环单词。
 * @date : 2017/3/13 16:31
 */
public class LoopWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> set = new HashSet<String>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (!set.contains(s)){
                set.add(s);
                count++;

                //把这个词的所有循环词放入set中
                for (int j = 0; j < s.length() - 1; j++) {
                    s=s.charAt(s.length()-1)+s.substring(0,s.length()-1);
                    set.add(s);
                }
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
